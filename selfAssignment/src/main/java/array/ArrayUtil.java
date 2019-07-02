package array;

/**
 * Created by pankaj on 06,2019
 */
public class ArrayUtil {

  public int binarySearch(int arr[], int startIndex, int endIndex, int searchElement) {
    if (startIndex > endIndex) {
      return -1;
    }

    int mid = getMidIndex(startIndex, endIndex);
    if (arr[mid] == searchElement) {
      return mid;
    } else {
      if (arr[startIndex] < searchElement && searchElement < arr[mid]) {
        return binarySearch(arr, startIndex, endIndex, searchElement);
      } else {
        return binarySearch(arr, mid + 1, endIndex, searchElement);
      }
    }
  }

  private int getMidIndex(int startIndex, int endIndex) {
    return startIndex + (endIndex - startIndex) / 2;
  }
}
