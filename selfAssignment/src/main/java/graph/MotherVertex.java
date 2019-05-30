package graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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

  private boolean checkGraphHasAnyVisitedVertex(boolean visited[]) {
    for (int i = 0; i < graph.getNumberOfVertex(); i++) {
      if (!visited[i]) {
        return true;
      }
    }
    return false;
  }

  private Graph getTransponseGraph() {
    List<Integer>[] graphAdjencyList = graph.getAdjencyList();
    Graph transposeGraph = new Graph(graph.getNumberOfVertex());
    for (int i = 0; i < graph.getNumberOfVertex(); i++) {
      List<Integer> integerList = graphAdjencyList[i];
      if (integerList != null) {
        for (Integer vertex : integerList) {
          transposeGraph.addEdge(vertex, i);
        }
      }
    }
    return transposeGraph;
  }

  public Integer findMotherVertexUsingKosaraju() {
    Stack<Integer> firstTraceVertexStack = getTraceVertexStack(graph);
    graph.printAdjencyList();
    List<List<Integer>> connectedComponents = getStronglyConnectedComponents(graph,
        firstTraceVertexStack);
    for (List<Integer> strongComponets : connectedComponents) {
      if (strongComponets.size() == graph.getNumberOfVertex()) {
        return strongComponets.get(0);
      }
    }
    return -1;
  }

  private Stack<Integer> getTraceVertexStack(Graph graph) {
    boolean visitedVertex[] = new boolean[graph.getNumberOfVertex()];
    Stack<Integer> stack = new Stack();
    for (int i = 0; i < graph.getNumberOfVertex(); i++) {
      if (!visitedVertex[i]) {
        visitedVertex[i] = true;
        List<Integer> list = graph.getAdjencyList()[i];
        if (list != null) {
          storLastVisiteNode(list, stack, visitedVertex);
        }
        stack.add(i);
      }
    }
    return stack;
  }

  private void storLastVisiteNode(List<Integer> list, Stack<Integer> stack,
      boolean visitedVertex[]) {
    if (list != null) {
      for (Integer vertex : list) {
        if (!visitedVertex[vertex]) {
          visitedVertex[vertex] = true;
          storLastVisiteNode(graph.getAdjencyList()[vertex], stack, visitedVertex);
          stack.add(vertex);
        }
      }
    }
  }

  private List<List<Integer>> getStronglyConnectedComponents(Graph graph, Stack<Integer> stack) {
    boolean visitedVertex[] = new boolean[graph.getNumberOfVertex()];
    List<List<Integer>> strongComponets = new ArrayList();
    while (!stack.empty()) {
      Integer vertex = stack.pop();
      List<Integer> componet = new ArrayList<>();
      List<Integer> list = graph.getAdjencyList()[vertex];
      Stack<Integer> trace = new Stack<>();
      if (list != null) {
        storLastVisiteNode(list, trace, visitedVertex);
      }
      if (!visitedVertex[vertex]) {
        componet.add(vertex);
        visitedVertex[vertex] = true;
      }
      while (!trace.empty()) {
        componet.add(trace.pop());
      }
      if (!componet.isEmpty()) {
        strongComponets.add(componet);
      }
    }
    return strongComponets;
  }
}
