package tree.model;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by pankaj on 02,2019
 */
public class Tree {

  public Node createNode(Node root, int arr[], int index) {
    if (index >= arr.length || arr[index] == -1) {
      return null;
    }
    root = new Node(arr[index]);
    root.left = createNode(root.left, arr, index * 2 + 1);
    root.right = createNode(root.right, arr, index * 2 + 2);
    return root;
  }

  public LevelNode createLevelNode(LevelNode root, int arr[], int index) {
    if (index >= arr.length || arr[index] == -1) {
      return null;
    }
    root = new LevelNode(arr[index]);
    root.left = createLevelNode(root.left, arr, index * 2 + 1);
    root.right = createLevelNode(root.right, arr, index * 2 + 2);
    return root;
  }

  public void print(Node root) {
    if (root == null) {
      return;
    }
    System.out.println(root.getData());
    print(root.left);
    print(root.right);
  }

  private void printLeafNode(Node root) {
    if (root == null) {
      return;
    }
    if (root.left == null && root.right == null) {
      System.out.print(root.getData() + " ");
    }
    printLeafNode(root.left);
    printLeafNode(root.right);
  }

  private void printLeftNodes(Node root) {
    if (root.left == null || root == null) {
      return;
    }
    System.out.println(root.getData());
    printLeftNodes(root.left);
  }

  private void printRightNodes(Node root) {
    if (root.right == null || root == null) {
      return;
    }
    System.out.println(root.getData());
    printRightNodes(root.right);
  }

  public void printBoundary(Node root) {
    System.out.println(root.getData());
    printLeftNodes(root.left);
    printLeafNode(root);
    printRightNodes(root.right);
  }

  public List<Integer> printTopView(Node root) {
    HashMap<Node, Integer> map = new HashMap();
    Queue<Node> queue = new ArrayDeque();
    queue.add(root);
    ;
    map.put(root, 0);
    while (!queue.isEmpty()) {
      Node node = queue.poll();
      int distance = map.containsKey(node) ? map.get(node) : 0;
      if (node.left != null) {
        queue.add(node.left);
        if (!map.containsValue(distance - 1)) {
          map.put(node.left, distance - 1);
        }
      }
      if (node.right != null) {
        queue.add(node.right);
        if (!map.containsValue(distance + 1)) {
          map.put(node.right, distance + 1);
        }
      }

    }
    List<Integer> list = new ArrayList<>();
    for (Map.Entry<Node, Integer> entry : map.entrySet()) {
      list.add(entry.getKey().getData());
    }
    return list;
  }

  public void printBottomView(Node root) {
    Map<Integer, Node> map = new HashMap();
    Queue<TreeNode> queue = new ArrayDeque();
    queue.add(new TreeNode(0, root));
    while (!queue.isEmpty()) {
      TreeNode temp = queue.poll();
      Node tempNode = temp.getNode();
      int distance = temp.getDistance();
      map.put(distance, tempNode);
      if (tempNode.left != null) {
        queue.add(new TreeNode(distance - 1, tempNode.left));
      }
      if (tempNode.right != null) {
        queue.add(new TreeNode(distance + 1, tempNode.right));
      }
    }
    for (Map.Entry<Integer, Node> entry : map.entrySet()) {
      System.out.print(entry.getValue().getData() + " ");
    }
  }

  public void connectSameLevelNode(LevelNode root) {
    Queue<LevelNode> queue = new LinkedList();
    Queue<LevelNode> queue1 = new LinkedList();
    queue.add(root);
    queue.add(null);

    queue1.add(root);
    queue1.add(null);

    while (!queue.isEmpty()) {
      LevelNode temp = queue.poll();
      if (temp == null) {
        if (queue.isEmpty()) {
          break;
        }
        queue1.add(null);
        queue.add(null);
      } else {
        if (temp.left != null) {
          queue.add(temp.left);
          queue1.add(temp.left);
        }
        if (temp.right != null) {
          queue.add(temp.right);
          queue1.add(temp.right);
        }

      }
    }
    System.out.println("Queue:--" + queue1.size());
    LevelNode prev = null;
    while (!queue1.isEmpty()) {
      LevelNode tempNode = queue1.poll();
      if (tempNode == null) {
        prev = null;
      } else if (prev == null) {
        prev = tempNode;
      } else {
        prev.nextSibbling = tempNode;
        prev = tempNode;
      }
    }

  }

  public void printLevelNode(LevelNode root) {
    if (root == null) {
      return;
    }
    System.out.println(root.getData());
    ;
    printLevelNode(root.left);
    printLevelNode(root.right);
  }

  public int getHeight(Node root) {
    if (root == null) {
      return 0;
    }
    return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
  }
}

@Data
@AllArgsConstructor
class TreeNode {

  private int distance;
  private Node node;

}
