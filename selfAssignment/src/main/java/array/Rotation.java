package array;

import java.util.Arrays;

/**
 * Created by pankaj on 05,2019
 */
public class Rotation {

  //Mehod-1
  public int[] rotateMethod1(int arr[], int d, int length) {
    int temp[] = new int[d];
    for (int i = 0; i < d; i++) {
      temp[i] = arr[i];
    }
    int index = 0;
    for (int j = d; j < length; j++, index++) {
      arr[index] = arr[j];
    }
    for (int i = 0; i < d; i++, index++) {
      arr[index] = temp[i];
    }
    return arr;
  }

  //Swap Method
  public int[] rotateMethod2(int arr[], int d, int length) {
    reverse(arr, 0, length - 1);
    reverse(arr, 0, d - 1);
    reverse(arr, d, length - 1);
    return arr;
  }

  private void reverse(int arr[], int startIndex, int endIndex) {
    while (startIndex < endIndex) {
      swap(arr, startIndex, endIndex);
      startIndex++;
      endIndex--;
    }
  }

  private void swap(int arr[], int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public int[] rotateMethod3(int arr[], int d, int length) {
    int tempArray[] = Arrays.copyOf(arr, length);
    int jump = GCD(length, d);
    for (int i = 0; i < d; i++) {
      int startValue = tempArray[i];
      int j = i + jump;
      while (j != i) {
        int temp = tempArray[j];
        tempArray[j] = startValue;
        startValue = temp;
        j += jump;
        if (j >= length) {
          j = j % length;
        }
      }
      tempArray[i] = startValue;
    }
    return tempArray;
  }

  private int GCD(int a, int b) {
    if (a % b == 0) {
      return b;
    } else {
      return GCD(b, a % b);
    }
  }
}
