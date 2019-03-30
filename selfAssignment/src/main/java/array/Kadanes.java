package array;

import java.util.Scanner;

/**
 * Created by pankaj on 03,2019
 */
public class Kadanes {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int testCase = sc.nextInt();
    while (testCase-- > 0) {
      int len = sc.nextInt();
      int arr[] = new int[len];
      for(int i=0;i<len;i++){
        arr[i]=sc.nextInt();
      }
      int maxSum = Integer.MIN_VALUE;
      int sum = 0;
      for (int i = 0; i < len; i++) {
        sum = sum + arr[i];
        if (sum < 0) {
          sum = 0;
        }
        if (sum > maxSum) {
          maxSum = sum;
        }

      }
      if (maxSum == 0) {
        maxSum = getMaxNegative(arr);
      }
      System.out.println(maxSum);
    }
  }

  private static int getMaxNegative(int arr[]) {
    int num = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > num) {
        num = arr[i];
      }
    }
    return num;
  }
}
