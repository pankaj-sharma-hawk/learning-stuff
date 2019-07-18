package amazon;

/**
 * Created by pankaj on 07,2019
 */
public class MaximumProduct {

  public static void main(String[] args) {
    int arr[] = {-1, -3, -4, 2, 0, -5};
    MaximumProduct maximumProduct=new MaximumProduct();
    System.out.println(maximumProduct.getProductPair(arr));
  }

  public Pair getProductPair(int arr[]) {
    int firstMax = Integer.MIN_VALUE;
    int secondMax = 0;
    int firstMin = Integer.MAX_VALUE;
    int secondMin = 0;
    for (int i = 0; i < arr.length; i++) {
      if (firstMax < arr[i]) {
        secondMax = firstMax;
        firstMax = arr[i];
      }
      if (firstMin > arr[i]) {
        secondMin = firstMin;
        firstMin = arr[i];
      }
    }
    return (firstMax * secondMax) > (secondMin * firstMin) ? new Pair(firstMax, secondMax)
        : new Pair(firstMin, secondMin);
  }

  class Pair {

    public int x;
    public int y;

    public Pair(int x, int y) {
      this.x = x;
      this.y = y;
    }

    @Override
    public String toString() {
      return "Pair{" +
          "x=" + x +
          ", y=" + y +
          '}';
    }
  }
}
