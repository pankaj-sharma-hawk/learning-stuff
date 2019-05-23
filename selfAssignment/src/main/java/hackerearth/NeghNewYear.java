package hackerearth;

import java.util.Scanner;

/**
 * Created by pankaj on 04,2019
 */
public class NeghNewYear {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int test=scanner.nextInt();
    while (test-->0){
      int size=scanner.nextInt();
      int arr[]=new int[size];
      int maxSum[]=new int[size];
      for(int i=0;i<size;i++){
        arr[i]=scanner.nextInt();
      }
      maxSum[0]=arr[0];
      maxSum[1]=Math.max(arr[0],arr[1]);
      for(int i=2;i<size;i++){
        maxSum[i]=Math.max(arr[i],Math.max(arr[i]+maxSum[i-2],maxSum[i-1]));
      }
      int index=size-1;
      StringBuilder sb= new StringBuilder();
      while (index>0){
        if(maxSum[index]==maxSum[index-1]){
          index--;
        }else{
          sb.append(arr[index]);
          index-=2;
        }
      }
      if(index==0 && maxSum[index]>0){
        sb.append(arr[index]);
      }
      System.out.println(sb.toString());
    }
  }


}
