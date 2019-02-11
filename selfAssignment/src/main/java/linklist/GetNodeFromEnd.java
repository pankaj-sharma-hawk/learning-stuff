package linklist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * Created by pankaj on 09,2018
 */
public class GetNodeFromEnd {

    public static void main(String arg[]){
        Node head = LinkedList.head;
        Scanner sc = new Scanner(System.in);
        int n=3;
         /**
          * 1->2->3->4->5->6-7>->8->9->10
       */
         LinkedList.printList(head);
        Node newHead=reverseList(head);
        LinkedList.printList(newHead);

    }

    public static Node reverseList(Node head){
        if(head.getNext()==null){
           return head;
        }
        Node nextNode=head.getNext();
        head.setNext(null);
        Node endNode=reverseList(nextNode);
        nextNode.setNext(head);
        return endNode;
    }

    public static Node reverseGroupList(Node head,int groupSize){

        return null;
    }

}
