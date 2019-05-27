package graph;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pankaj on 05,2019
 */
public class Graph {

  private int numberOfVertex;
  private List<Integer> adjencyList[];

  public Graph(int numberOfVertex) {
    this.numberOfVertex = numberOfVertex;
    adjencyList=new ArrayList[numberOfVertex];
  }

  public void addEdge(int v,int u){
    if(adjencyList[v]==null){
      adjencyList[v]=new ArrayList<>();
    }
    adjencyList[v].add(u);
  }

  public void printAdjencyList(){
    for(int i=0;i<numberOfVertex;i++){
      System.out.println(i+"-->"+adjencyList[i]);
    }
  }

  public int getNumberOfVertex() {
    return numberOfVertex;
  }

  public List<Integer>[] getAdjencyList() {
    return adjencyList;
  }
}
