package graph;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by pankaj on 05,2019
 */
@Data
@AllArgsConstructor
public class TransitiveClosure {

  private Graph graph;

  public int[][] getTransitiveClosureGraph() {
    int[][] transiveGraphPath = new int[graph.getNumberOfVertex()][graph.getNumberOfVertex()];
    for (int i = 0; i < graph.getNumberOfVertex(); i++) {
      DFSUtil(i, transiveGraphPath[i], new boolean[graph.getNumberOfVertex()]);
    }
    return transiveGraphPath;
  }

  private void DFSUtil(int nextIndex, int[] transitiveGraphPath,
      boolean[] visitedVertex) {
    if (!visitedVertex[nextIndex]) {
      visitedVertex[nextIndex] = true;
      transitiveGraphPath[nextIndex] = 1;
      List<Integer> list = graph.getAdjencyList()[nextIndex];
      if (list != null) {
        for (Integer vertex : list) {
          DFSUtil(vertex, transitiveGraphPath, visitedVertex);
        }
      }
    }
  }

  public void printGraph(int[][] graphArray) {
    for (int i = 0; i < graphArray.length; i++) {
      for (int j = 0; j < graphArray.length; j++) {
        System.out.print(graphArray[i][j]);
      }
      System.out.println();
    }
  }

}
