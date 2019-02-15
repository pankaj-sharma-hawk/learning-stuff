package tree;

import tree.model.BinarySearchTree;
import tree.model.Node;
import tree.model.Tree;
import tree.sevice.TreeService;
import tree.sevice.TreeUtils;

/**
 * Created by pankaj on 02,2019
 */
public class BinarySearchMain {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        int arr[]={12,7,6,10,8,20,15,13,16,22,26};
        Node tree1 = binarySearchTree.createBinarySearchTree(arr);
       /* binarySearchTree.print(root);
        binarySearchTree.deleteNode(root,20);
        System.out.println("---------------------------");
        binarySearchTree.print(root);*/
        int arr1[]={1,2,3,4,5,6,7,-1,-1,-1,-1,-1,-1,-1,-1};
        TreeService treeService = new TreeService(new Tree());
        Node tree2=treeService.createBinaryTree(arr1);

        TreeUtils treeUtils = new TreeUtils();
        if(treeUtils.isTreeBST(tree1)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
