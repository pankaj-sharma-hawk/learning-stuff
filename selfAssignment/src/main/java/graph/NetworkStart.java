package graph;

/**
 * Created by pankaj on 05,2019
 */
public class NetworkStart {

  public static void main(String[] args) {
    Graph graph = new Graph(7);
    /*graph.addEdge(0,1);
    graph.addEdge(0,2);
    graph.addEdge(1,2);
    graph.addEdge(2,0);
    graph.addEdge(2,3);
    graph.addEdge(3,3);*/
    graph.addEdge(0,1);
    graph.addEdge(0,2);
    graph.addEdge(1,3);
    graph.addEdge(4,1);
    graph.addEdge(6,4);
    graph.addEdge(6,0);
    graph.addEdge(5,6);
    graph.addEdge(5,2);
    graph.printAdjencyList();

   /* GraphUtil graphUtil = new GraphUtil(graph.getNumberOfVertex());
    graphUtil.graphBFS(graph,2);
    System.out.println();
    graphUtil.graphDFS(graph,2);*/
   MotherVertex motherVertex = new MotherVertex(graph);
    Integer motherVertex1 = motherVertex.findMotherVertex();
    System.out.println(motherVertex1);

  }
}
