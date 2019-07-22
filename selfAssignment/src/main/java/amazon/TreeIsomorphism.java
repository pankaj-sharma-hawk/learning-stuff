package amazon;

import tree.model.Node;
import tree.model.Tree;

/**
 * Created by pankaj on 07,2019
 */
public class TreeIsomorphism {

  public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5, 6, -1, -1, -1, 7, 8};
    int arr1[] = {1, 3, 2, -1, 6, 5, 4, -1, -1, -1, -1, -1, -1, 8, 7};
    Tree tree = new Tree();
    Node root = tree.createNode(null, arr, 0);
    Node root1 = tree.createNode(null, arr1, 0);
    System.out.println(isTreeIsoMorphism(root,root1));
  }

  public static boolean isTreeIsoMorphism(Node root1,Node root2){
    if(root1==null && root2!=null || root1!=null && root2==null)
      return false;
    if(root1==null && root2==null)
      return true;
    if(root1.getData()!=root2.getData())
      return false;
    else {
      return ( isTreeIsoMorphism(root1.left,root2.right) &&
          isTreeIsoMorphism(root1.right,root2.left));
    }
  }
}
