package old.array;

import java.util.Scanner;

/**
 * Created by pankaj on 03,2019
 */
public class MissingNumber {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int testCase=sc.nextInt();
    while (testCase-->0){
      int len=sc.nextInt();
      int sumFirst=(len*(len+1))/2;
      int sumSecond=0;
      int arr[]=new int[len-1];
      for(int i=0;i<len-1;i++){
        arr[i]=sc.nextInt();
        sumSecond+=arr[i];
      }
      System.out.println(sumFirst-sumSecond);
    }
  }

}
