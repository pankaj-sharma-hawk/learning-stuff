package array;

/**
 * Created by pankaj on 05,2019
 */
public class ArrayMain {

  public static void main(String[] args) {
    Rotation rotation = new Rotation();
    CyclicalRotate cyclicalRotate = new CyclicalRotate();
    SearchElementRotatedArray searchElementRotatedArray = new SearchElementRotatedArray();
    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    int[] rotateArray = cyclicalRotate.cyclicRotationsMethod1(arr, 3);
    System.out.println(
        searchElementRotatedArray.searchEleInRotateArray(rotateArray, 0, rotateArray.length-1, 10));

  }
}
