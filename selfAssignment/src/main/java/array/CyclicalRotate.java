package array;

/**
 * Created by pankaj on 06,2019
 */
public class CyclicalRotate {

  public int[] cyclicRotationsMethod1(int arr[], int d) {
    int tempArr[] = new int[d];
    for (int i = arr.length - d, index = 0; i < arr.length; i++, index++) {
      tempArr[index] = arr[i];
    }
    for (int i = arr.length - d - 1, lastIndex = arr.length - 1; i >= 0; i--, lastIndex--) {
      arr[lastIndex] = arr[i];
    }
    for (int i = 0; i < d; i++) {
      arr[i] = tempArr[i];
    }
    return arr;
  }

}
