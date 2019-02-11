package hackerearth;

import hackerearth.util.Node;
import hackerearth.util.SegmentTree;

import java.time.temporal.ValueRange;
import java.util.Scanner;

/**
 * Created by pankaj on 02,2019
 */
public class PlayNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int Q=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        SegmentTree segmentTree = new SegmentTree();
        Node root=segmentTree.addSumSegmentTree(arr);
        for(int i=0;i<Q;i++){
            int left=sc.nextInt()-1;
            int right=sc.nextInt()-1;
            int sumRange=segmentTree.getSumValueRange(root,left,right);
            double countValue=right-left+1;
            System.out.println((int)Math.floor(sumRange/countValue));

        }
    }
}
