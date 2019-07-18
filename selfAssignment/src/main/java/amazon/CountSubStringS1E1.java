package amazon;

/**
 * Created by pankaj on 07,2019
 */
public class CountSubStringS1E1 {

  public static void main(String[] args) {
    System.out
        .println(countNumberOfSubStringStartWith1AndEndWith1("10010011100100010100".toCharArray()));
  }

  public static int countNumberOfSubStringStartWith1AndEndWith1(char arr[]) {
    int countOne = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == '1') {
        countOne++;
      }
    }
    return countOne * (countOne - 1) / 2;
  }

}
