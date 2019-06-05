package graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by pankaj on 06,2019
 */
public class CountNodeGivenLevel {


  public int countNumberOfNodeAtLevel(Graph graph, int level) {

    Queue<Integer> queue = new LinkedList<>();

    queue.add(0);
    queue.add(null);
    int count = 0;
    int currentLevel = 0;
    while (!queue.isEmpty()) {
      Integer currentVertex = queue.poll();
      if (currentVertex == null) {
        if (queue.isEmpty()) {
          break;
        }
        queue.add(null);
        currentLevel++;
      } else {
        if (currentLevel == level) {
          count++;
        }
        List<Integer> list = graph.getAdjencyList()[currentVertex];
        if (list != null) {
          for (Integer nextVertex : list) {
            queue.add(nextVertex);
          }

        }
      }
    }
    return count;
  }

}
