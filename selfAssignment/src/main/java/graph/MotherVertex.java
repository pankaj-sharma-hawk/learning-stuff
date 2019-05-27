package graph;

import java.util.List;

/**
 * Created by pankaj on 05,2019
 */
public class MotherVertex {

  private Graph graph;

  public MotherVertex(Graph graph) {
    this.graph = graph;
  }

  public Integer findMotherVertex() {
    GraphUtil graphUtil = new GraphUtil(graph.getNumberOfVertex());
    int motherVertex = -1;
    for (int i = 0; i < graph.getNumberOfVertex(); i++) {
      graphUtil.graphBFS(graph, i);
      boolean checkAllVertexVisited = graphUtil.checkAllVertexVisited();
      if (checkAllVertexVisited) {
        motherVertex = i;
        break;
      } else {
        graphUtil.resetVisitedVertex();
      }
    }
    return motherVertex;
  }
}
