package rahul;

import java.util.Scanner;

public class FindPairNumber {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int input=scanner.nextInt();
    int sum=0;
    int start;
    sum=start=3;
    int prev=0;
    while (sum<input){
      prev=sum;
      start*=2;
      sum=sum+start;
    }
    int diff=input-(prev+1);
    System.out.println(start-diff+1);
  }
}
