package amazon;

/**
 * Created by pankaj on 07,2019
 */
public class ReplaceGreatestElement {

  public static void main(String[] args) {
    int arr[] = {16, 17, 4, 3, 5, 2};
    print(replaceGreatestElementInArray(arr));
  }

  public static void print(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static int[] replaceGreatestElementInArray(int arr[]) {
    int maxValue = -1;
    for (int i = arr.length - 1; i >= 0; i--) {
      if (arr[i] > maxValue) {
        int temp = maxValue;
        maxValue = arr[i];
        arr[i] = temp;
      } else {
        arr[i] = maxValue;
      }

    }
    return arr;
  }
}
