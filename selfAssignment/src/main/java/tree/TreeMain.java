package tree;

import tree.model.LevelNode;
import tree.model.Node;
import tree.model.Tree;
import tree.sevice.TreeService;

/**
 * Created by pankaj on 02,2019
 */
public class TreeMain {
    public static void main(String[] args) {
        //int arr[]={20,8,22,4,12,-1, 25,-1,-1,10,14};
        //int arr1[]={1,2,3,4,5,6,7,-1,-1,-1,-1,-1,-1,-1,-1};
        //int arr[]={20,8,22,5,3,4,25,-1,-1,10,14,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
        int arr[]={1,2,3,4,5,6,7,-1,-1,8,-1,-1,9,-1,10,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
        TreeService treeService = new TreeService(new Tree());
        //Node root=treeService.createBinaryTree(arr);
        LevelNode root=treeService.createLevelNode(arr);
        //treeService.printTopView(root);
        //treeService.print(root);
        treeService.printLevelNode(root);
        System.out.println("----------------------");
        //treeService.printBottomView(root);
        treeService.connectSameLevelNode(root);
    }
}
