package tree.sevice;

import tree.model.BinarySearchTree;
import tree.model.Node;

/**
 * Created by pankaj on 02,2019
 */
public class BinarySearchService {
   private BinarySearchTree binarySearchTree;

    public BinarySearchService(BinarySearchTree binarySearchTree) {
        this.binarySearchTree = binarySearchTree;
    }

    public Node createBinarySearchTree(int arr[]){
        return binarySearchTree.createBinarySearchTree(arr);
    }
}
