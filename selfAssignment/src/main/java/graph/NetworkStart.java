package graph;

/**
 * Created by pankaj on 05,2019
 */
public class NetworkStart {

  public static void main(String[] args) {
    Graph graph = new Graph(7);
    /*graph.addEdge(0, 1);
    graph.addEdge(1, 2);
    graph.addEdge(1, 3);
    graph.addEdge(2, 0);
    graph.addEdge(3, 4);
    graph.addEdge(4, 5);
    graph.addEdge(5, 3);
    graph.addEdge(6, 5);
    graph.addEdge(6, 7);
    graph.addEdge(7, 8);
    graph.addEdge(8, 9);
    graph.addEdge(9, 6);
    graph.addEdge(9, 10);*/
    graph.addEdge(0, 1);
    graph.addEdge(0, 2);
    graph.addEdge(1, 3);
    graph.addEdge(4, 1);
    graph.addEdge(6, 4);
    graph.addEdge(5, 6);
    graph.addEdge(5, 2);
    graph.addEdge(6, 0);
    MotherVertex motherVertex = new MotherVertex(graph);
    System.out.println(motherVertex.findMotherVertexUsingKosaraju());
  }
}
