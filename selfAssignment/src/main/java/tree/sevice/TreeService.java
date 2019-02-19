package tree.sevice;

import tree.model.LevelNode;
import tree.model.Node;
import tree.model.Tree;

/**
 * Created by pankaj on 02,2019
 */
public class TreeService {
    private Tree tree;

    public TreeService(Tree tree) {
        this.tree = tree;
    }

    public Node createBinaryTree(int arr[]){
        Node root=tree.createNode(new Node(),arr,0);
        return root;
    }

    public void printBoundaryNodes(Node root){
        tree.printBoundary(root);
    }

    public void printTopView(Node root){
        System.out.println(tree.printTopView(root));
    }

    public void printBottomView(Node root){
        tree.printBottomView(root);
    }

    public void print(Node root){
        tree.print(root);
    }

    public void printLevelNode(LevelNode root){
        tree.printLevelNode(root);
    }

    public void connectSameLevelNode(LevelNode root){
        tree.connectSameLevelNode(root);
    }

    public LevelNode createLevelNode(int arr[]){
        LevelNode levelNode=tree.createLevelNode(new LevelNode(),arr,0);
        return levelNode;
    }
}
