package tree;

import tree.model.BinarySearchTree;
import tree.model.Node;

/**
 * Created by pankaj on 02,2019
 */
public class BinarySearchMain {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        int arr[]={12,7,6,10,8,20,15,13,16,22,26};
        Node root = binarySearchTree.createBinarySearchTree(arr);
        binarySearchTree.print(root);
        binarySearchTree.deleteNode(root,20);
        System.out.println("---------------------------");
        binarySearchTree.print(root);
    }
}
