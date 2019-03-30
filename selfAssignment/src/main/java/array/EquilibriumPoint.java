package array;

import java.util.Scanner;

/**
 * Created by pankaj on 03,2019
 */
public class EquilibriumPoint {

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int testCase=sc.nextInt();
    while (testCase-->0){
      int len=sc.nextInt();
      int arr[]=new int[len];
      for(int i=0;i<len;i++){
        arr[i]=sc.nextInt();
      }

      int leftSum[]=new int[len];
      leftSum[0]=arr[0];
      for(int i=1;i<len;i++){
        leftSum[i]=leftSum[i-1]+arr[i];
      }

      int rightSum[]=new int[len];
      rightSum[len-1]=arr[len-1];
      for(int i=len-2;i>=0;i--){
        rightSum[i]=rightSum[i+1]+arr[i];
      }
      int resultIndex=-2;
      boolean flag=false;
      for(int i=0;i<len;i++){
        while (i<len && rightSum[i]==leftSum[i]){
          flag=true;
          resultIndex=i;
          i++;
        }
        if(flag)
          break;
      }
      System.out.println(resultIndex+1);
    }
  }
}
