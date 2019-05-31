package graph;

/**
 * Created by pankaj on 05,2019
 */
public class NetworkStart {

  public static void main(String[] args) {
    Graph graph = new Graph(4);
    graph.addEdge(0, 1);
    graph.addEdge(0, 2);
    graph.addEdge(1, 2);
    graph.addEdge(2, 0);
    graph.addEdge(2, 3);
    TransitiveClosure transitiveClosure = new TransitiveClosure(graph);
    transitiveClosure.printGraph(transitiveClosure.getTransitiveClosureGraph());
  }
}
