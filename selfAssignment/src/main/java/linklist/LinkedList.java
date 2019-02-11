package linklist;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

/**
 * Created by pankaj on 09,2018
 */
public class LinkedList {
    static public Node head=new Node();
    static {
        LinkedList linkedList = new LinkedList();
        linkedList.createLinkedList(head,12);
        linkedList.createLinkedList(head,13);
        linkedList.createLinkedList(head,14);
        linkedList.createLinkedList(head,15);
        linkedList.createLinkedList(head,16);
        linkedList.createLinkedList(head,17);
        linkedList.createLinkedList(head,18);
        linkedList.createLinkedList(head,19);


    }



    public void createLinkedList(Node head,Object number){

        if(head==null || head.getData()==null){
            if(head==null){
                head=new Node(number);
            }else {
                head.setData(number);
            }
        }else{
            while(head.getNext()!=null){
                head=head.getNext();
            }
            head.setNext(new Node(number));
        }

    }
    public static  void printList(Node head){
        while(head!=null){
            System.out.print(head.getData()+"->");
            head=head.getNext();
        }

        System.out.println();
    }
}
