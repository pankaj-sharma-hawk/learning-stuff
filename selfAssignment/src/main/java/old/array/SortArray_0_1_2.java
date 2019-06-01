package old.array;

import java.util.Scanner;

/**
 * Created by pankaj on 03,2019
 */
public class SortArray_0_1_2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int testCase = sc.nextInt();
    while (testCase-- > 0) {
      int len = sc.nextInt();
      int arr[] = new int[len];
      for (int i = 0; i < len; i++) {
        arr[i] = sc.nextInt();
      }

      // 2 2 0 0 1 1 0 2 2 1
      int firstIndex = 0;
      int mid = 0;
      int lastIndex = len - 1;

      while (mid <= lastIndex) {

        switch (arr[mid]) {
          case 0: swap(arr,firstIndex,mid);
          firstIndex++;
          mid++;
            break;
          case 1:
            mid++;
            break;
          case 2:
            swap(arr, mid, lastIndex);
            lastIndex--;
            break;
        }
      }
      for (int i=0;i<len;i++){
        System.out.print(arr[i]+" ");
      }
    }
  }

  private static void swap(int arr[], int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

}
