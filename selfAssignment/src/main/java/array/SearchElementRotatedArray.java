package array;

/**
 * Created by pankaj on 06,2019
 */
public class SearchElementRotatedArray {

  private int getPivotElement(int arr[], int startIndex, int endIndex) {
    if (startIndex > endIndex) {
      return -1;
    }
    int mid = getMidElement(startIndex, endIndex);
    if (arr[mid] < arr[mid + 1]) {
      return mid;
    } else {
      if (true) {
        return getPivotElement(arr, mid, endIndex);
      } else {
        return getPivotElement(arr, startIndex, mid - 1);
      }
    }
  }

  private int getMidElement(int startIndex, int endIndex) {
    return startIndex + (endIndex - startIndex) / 2;
  }

  public int searchEleInRotateArray(int arr[], int startIndex, int endIndex, int searchElement) {
    ArrayUtil arrayUtil = new ArrayUtil();
    int pivotIndex = getPivotElement(arr, startIndex, endIndex);
    int searchIndex = 0;
    if (arr[startIndex] < searchElement && searchElement < arr[pivotIndex]) {
      searchIndex = arrayUtil.binarySearch(arr, startIndex, pivotIndex, searchElement);
    } else {
      searchIndex = arrayUtil.binarySearch(arr, pivotIndex, endIndex, searchElement);
    }
    return searchIndex;
  }


}
