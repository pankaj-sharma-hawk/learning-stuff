package tree.model;

/**
 * Created by pankaj on 02,2019
 */
public class BinarySearchTree {

    private Node addNodeBinaryTree(Node root, int data) {
        if(root==null){
            return new Node(data);
        }
        if(root.getData()>data)
            root.left=addNodeBinaryTree(root.left,data);
        if(root.getData()<=data)
            root.right=addNodeBinaryTree(root.right,data);
        return root;
    }

    public Node createBinarySearchTree(int arr[]){
        Node root=null;
        for(int i=0;i<arr.length;i++) {
            root = addNodeBinaryTree(root,arr[i]);
        }
        return root;
    }

    public void print(Node root){
        if(root==null)
            return;
        print(root.left);
        System.out.println(root.getData());
        print(root.right);
    }

    public void deleteNode(Node root,int data){
        deleteNode(root,data,null);
    }
    private void deleteNode(Node root,int data,Node prev){
        if(root==null)
            return;
        if(root.getData()==data){
            if(isLeaf(root)){
                deleteLeafNode(prev,data);
            }else if (isOneChild(root)){
                deleteOneChildNode(root);
            }else{
                deleteTwoChildNode(root);
            }
        }
        if (root.getData() > data) {
            deleteNode(root.left, data, root);
        } else {
            deleteNode(root.right, data, root);
        }

    }

    private void deleteTwoChildNode(Node root) {
        Node nodeRight=root.left;
        Node prev=null;
        while(nodeRight.right!=null){
            prev=nodeRight;
            nodeRight=nodeRight.right;
        }
        if(prev!=null){
            prev.right=null;
        }else{
            root.left=null;
        }
        root.setData(nodeRight.getData());

    }

    private void deleteOneChildNode(Node root) {
        if(root.left!=null){
            root.setData(root.left.getData());
            root.left=null;
        }else{
            root.setData(root.right.getData());
            root.right=null;
        }
    }

    private boolean isOneChild(Node root){
        return root.left==null && root.right!=null || root.right==null && root.left!=null;
    }

    private boolean isLeaf(Node root){
        return root.left==null && root.right==null;
    }

    private void deleteLeafNode(Node root , int data){
        if ((root.left.getData() == data)) {
            root.left = null;
        } else {
            root.right = null;
        }
    }

}
