package impl;

/**
 * Created by pankaj on 07,2019
 */
public class CustomMainClass {

  public static void main(String[] args) {
    CustomeLinkedHashMap<Integer, String> customeLinkedHashMap = new CustomeLinkedHashMap<>(10);
    customeLinkedHashMap.put(1, "A");
    customeLinkedHashMap.put(2, "B");
    customeLinkedHashMap.put(3, "C");
    customeLinkedHashMap.put(4, "D");
    customeLinkedHashMap.put(5, "E");
    //System.out.println(customeLinkedHashMap.get(4));
    CustomeLinkedHashMap.CustomNode<Integer, String> headNode = customeLinkedHashMap.getHeadNode();
    while (headNode != null) {
      System.out.println(headNode.value);
      headNode = headNode.nextNode;
    }
  }
}
