package amazon;

import tree.model.Node;
import tree.model.Tree;

/**
 * Created by pankaj on 07,2019
 */
public class MaximumDepthTree {

  public static void main(String[] args) {
    Tree tree = new Tree();
    int arr[] = {1, 2, 3, 4, 5, 6, 7};
    Node root = tree.createNode(null, arr, 0);
    System.out.println(tree.getHeight(root));
  }
}
