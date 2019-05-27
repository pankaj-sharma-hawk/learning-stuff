package graph;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;

/**
 * Created by pankaj on 05,2019
 */
public class GraphUtil {


  boolean visitedVertex[];

  public GraphUtil(int numberOfVertex) {
    this.visitedVertex = new boolean[numberOfVertex];
  }

  public void graphBFS(Graph graph, int startIndex) {
//    boolean visitedVertex[] = new boolean[graph.getNumberOfVertex()];
    Queue<Integer> queue = new ArrayDeque();
    queue.add(startIndex);
    visitedVertex[startIndex] = true;
    while (!queue.isEmpty()) {
      int currentVertex = queue.poll();
//      System.out.print(currentVertex + " ");
      List<Integer> list = graph.getAdjencyList()[currentVertex];
      if (list == null) {
        continue;
      }
      ListIterator<Integer> listIterator = list.listIterator();
      while (listIterator != null && listIterator.hasNext()) {
        Integer nextVertex = listIterator.next();
        if (!visitedVertex[nextVertex]) {
          queue.add(nextVertex);
          visitedVertex[nextVertex] = true;
        }
      }
    }
  }

  public void graphDFS(Graph graph, int startIndex) {
    dfs(graph, startIndex, visitedVertex);
  }

  private void dfs(Graph graph, int startIndex, boolean visitedVertex[]) {
    if (!visitedVertex[startIndex]) {
      System.out.print(startIndex + " ");
      visitedVertex[startIndex] = true;
      int size = graph.getAdjencyList()[startIndex].size();
      for (int i = 0; i < size; i++) {
        dfs(graph, graph.getAdjencyList()[startIndex].get(i), visitedVertex);
      }
    }
  }

  public boolean checkAllVertexVisited() {
    for (int i = 0; i < visitedVertex.length; i++) {
      if (!visitedVertex[i]) {
        return false;
      }
    }
    return true;
  }

  public void resetVisitedVertex() {
    Arrays.fill(visitedVertex, false);
  }

}
