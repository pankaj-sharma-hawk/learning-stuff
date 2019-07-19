package amazon;

import tree.model.Node;

/**
 * Created by pankaj on 07,2019
 */
public class ConstructTreePreOrder {

  public static void main(String[] args) {
    int pre[] = {10, 30, 20, 5, 15, 67, 89};
    char preLN[] = {'N', 'N', 'N', 'L', 'L', 'L', 'L'};
    Node root = null;
    root = constructTree(root, pre, preLN, 0);
    printNode(root);
  }

  private static Node constructTree(Node root, int[] pre, char[] preLN, int index) {
    if (index >= pre.length) {
      return null;
    }
    if (preLN[index] == 'L') {
      return new Node(pre[index]);
    } else {
      if (root == null) {
        root = new Node(pre[index]);
      }
      root.left = constructTree(root.left, pre, preLN, index * 2 + 1);
      root.right = constructTree(root.right, pre, preLN, index * 2 + 2);
      return root;
    }
  }

  private static void printNode(Node root) {
    if (root != null) {
      System.out.println(root.getData());
      printNode(root.left);
      printNode(root.right);
    }
  }


}
