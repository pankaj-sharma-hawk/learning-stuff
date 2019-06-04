package graph;

/**
 * Created by pankaj on 05,2019
 */
public class NetworkStart {

  public static void main(String[] args) {
    Graph g = new Graph(5);
    g.addEdge(1, 0);
    g.addEdge(0, 2);
    g.addEdge(2, 1);
    g.addEdge(0, 3);
    g.addEdge(1, 4);
    GraphUtil graphUtil = new GraphUtil(g.getNumberOfVertex());
    graphUtil.iterateDFSEveryVertex(g);
  }
}
