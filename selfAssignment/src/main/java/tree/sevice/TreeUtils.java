package tree.sevice;

import tree.model.Node;

/**
 * Created by pankaj on 02,2019
 */
public class TreeUtils {
    public boolean isTreeBST(Node root){
        if(root==null || root.left==null && root.right==null){
            return true;
        }
        if(root.left!=null && root.getData() > root.left.getData()){
            return isTreeBST(root.left);
        }else if(root.right!=null && root.getData() > root.right.getData()){
            return isTreeBST(root.right);
        }else {
            return false;
        }
    }
}
