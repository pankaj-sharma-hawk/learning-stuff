package linklist;

import lombok.Data;

/**
 * Created by pankaj on 02,2019
 */
public class CloneLinkedListRandomPointer {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        RandomNode head=null,current=null;
        current=head=new RandomNode(arr[0]);
        RandomNode randomNodeArray[]=new RandomNode[arr.length];
        randomNodeArray[0]=current;
        for(int i=1;i<arr.length;i++){

            current.next=new RandomNode(arr[i]);
            current=current.next;
            randomNodeArray[i]=current;
        }

        head.random=randomNodeArray[3];
        head.next.random=null;
        head.next.next.random=randomNodeArray[1];
        head.next.next.next.random=randomNodeArray[2];

        CloneLinkedListRandomPointer obj=new CloneLinkedListRandomPointer();

        obj.printList(head);
        obj.printRandomList(head);
        System.out.println();
        head=obj.cloneLinkedList(head);
        obj.printList(head);
        obj.printRandomList(head);
    }
    private void printList(RandomNode head){
        while (head!=null){
            System.out.print(head.getData()+" ");
            head=head.next;
        }
        System.out.println();
    }

    private void printRandomList(RandomNode head){
        while (head!=null){
            System.out.print(head.getData()+" ");
            head=head.random;
        }
    }

    private RandomNode cloneLinkedList(RandomNode head){
        RandomNode current=head;
        while (current!=null){
            RandomNode tempNode=new RandomNode(current.getData());
            tempNode.random=current.random;
            current.random=tempNode;
            current=current.next;
        }
        current=head;
        RandomNode current2=null;
        RandomNode head2=null;

        return head2;
    }

}
@Data
class RandomNode{
    private int data;
    public RandomNode next;
    public RandomNode random;

    public RandomNode(int data) {
        this.data = data;
    }
}
