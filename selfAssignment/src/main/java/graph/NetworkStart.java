package graph;

/**
 * Created by pankaj on 05,2019
 */
public class NetworkStart {

  public static void main(String[] args) {
    Graph g = new Graph(7);
    g.addEdge(0, 1);
    g.addEdge(0, 2);
    g.addEdge(1, 3);
    g.addEdge(1, 4);
    g.addEdge(1, 5);
    g.addEdge(2, 6);
    CountNodeGivenLevel countNodeGivenLevel = new CountNodeGivenLevel();
    System.out.println(countNodeGivenLevel.countNumberOfNodeAtLevel(g, 2));
  }
}
