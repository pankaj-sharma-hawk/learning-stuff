package amazon;

/**
 * Created by pankaj on 07,2019
 */
public class CountNumberOfSetBit {

  public static void main(String[] args) {
    System.out.println(countSetbitSimple(8));
  }

  public static int countSetbitSimple(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      int temp = i;
      while (temp > 0) {
        if ((temp & 1) == 1) {
          sum++;
        }
        temp = temp >> 1;
      }
    }
    return sum;
  }
}
