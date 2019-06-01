package array;

import java.util.Arrays;

/**
 * Created by pankaj on 05,2019
 */
public class ArrayMain {

  public static void main(String[] args) {
    Rotation rotation = new Rotation();
    int arr[] = {1, 2, 3, 4, 5, 6, 7,8,9};
    System.out.println(Arrays.toString(rotation.rotateMethod3(arr, 3, arr.length)));
  }
}
