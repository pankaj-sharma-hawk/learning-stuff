package old.array;

import java.util.Scanner;

/**
 * Created by pankaj on 03,2019
 */
public class SubarraySum {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int sum = sc.nextInt();
      int arr[] = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }
      int currentSum = arr[0];
      int startIndex = 0;
      boolean result=false;
      for (int i = 1; i <=n; i++) {

        while (currentSum > sum && startIndex < (i - 1)) {
          currentSum -= arr[startIndex++];
        }

        if (currentSum == sum) {
          System.out.println((startIndex + 1) + " " + i);
          result=true;
          break;
        }
        if (i < n) {
          currentSum += arr[i];
        }
      }
      if(!result)
        System.out.println("-1");
    }
  }
}
