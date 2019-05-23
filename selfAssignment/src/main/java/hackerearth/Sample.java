package hackerearth;

import java.util.Scanner;

/**
 * Created by pankaj on 04,2019
 */
public class Sample {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int size=sc.nextInt();
    StringBuilder sb = new StringBuilder();
    for(int i=size-1;i>=0;i--){
      Integer count=size;
      for(int j=0;j<size;j++){
        if(j==i){
          sb.append("*");
        }else{
          sb.append(count);
        }
        count--;
      }
      System.out.println(sb.toString());
      sb = new StringBuilder();
    }
  }

}
