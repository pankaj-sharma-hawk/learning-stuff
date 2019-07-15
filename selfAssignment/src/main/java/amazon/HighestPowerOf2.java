package amazon;

/**
 * Created by pankaj on 07,2019
 */
public class HighestPowerOf2 {

  public static void main(String[] args) {
    int power = getPowerOf2(32);
    System.out.println((int)Math.pow(2, power));
  }

  public static int getPowerOf2(int n) {
    int count = 0;
    while (n > 0) {
      n = n >> 1;
      count++;
    }
    return count-1;
  }

}
