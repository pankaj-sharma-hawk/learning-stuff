package geeksgeek;

import java.util.Arrays;

/**
 * Created by pankaj on 07,2019
 */
public class PalindromeDP {

  private static int countArray[][];

  public static void main(String[] args) {
    String str = "abcdef";
    char charArray[] = str.toCharArray();
    countArray = new int[charArray.length][charArray.length];
    for (int i = 0; i < charArray.length; i++) {
      Arrays.fill(countArray[i], 0);
    }
    int result = findMinimumInsertionPalindrom(charArray, 0, str.length() - 1);
    System.out.println(result);
  }

  private static int findMinimumInsertionPalindrom(char arr[], int start, int end) {
    while (start < end && arr[start] == arr[end]) {
      start++;
      end--;
    }
    if (countArray[start][end] != 0) {
      return countArray[start][end];
    }
    if (start >= end) {
      return 0;
    }
    countArray[start][end] = 1 + Math.min(findMinimumInsertionPalindrom(arr, start + 1, end),
        findMinimumInsertionPalindrom(arr, start, end - 1));
    return countArray[start][end];
  }
}
