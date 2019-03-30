package array;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by pankaj on 03,2019
 */
public class MaximumSumIncreasingSubsequence {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int testCase=sc.nextInt();
    while (testCase-->0){
      int len=sc.nextInt();
      int arr[]=new int[len];
      for(int i=0;i<len;i++){
        arr[i]=sc.nextInt();
      }

      int maxSum=Integer.MIN_VALUE;
      Stack<Integer> stack= new Stack<>();
      stack.push(arr[0]);
      int currentSum=0;
      for(int i=1;i<len;i++){
        if(stack.peek()>arr[i]){
          while (!stack.empty() && stack.peek()>arr[i]){
            currentSum+=stack.pop();
          }
          if(currentSum>maxSum)
            maxSum=currentSum;
          currentSum=0;
        }
        stack.push(arr[i]);
      }

      while (!stack.empty()){
        currentSum+=stack.pop();
      }
      if(currentSum>maxSum)
        maxSum=currentSum;

      System.out.println(maxSum);

    }
  }
}
