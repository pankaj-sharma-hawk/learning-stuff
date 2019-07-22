package amazon;

/**
 * Created by pankaj on 07,2019
 */
public class ReplaceZeroWithFive {

  public static void main(String[] args) {
    System.out.println(replaceZeroWithFive(10120));
  }

  public static int replaceZeroWithFive(int number) {
    int length = numberOfDigit(number);
    int sum = 0;
    for (int i = length; i > 0; i--) {
      int div = (int) Math.pow(10, i-1);
      int result = number / div;
      sum = sum * 10 + (result == 0 ? 5 : result);
      number = number % div;
    }
    return sum;
  }

  public static int numberOfDigit(int number) {
    int count = 0;
    while (number > 0) {
      number = number / 10;
      count++;
    }
    return count;
  }
}
