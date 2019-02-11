package hackerearth;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * Created by pankaj on 02,2019
 */
public class AmanMrSharma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        int count=0;
        for(int i=0;i<n;i++){
            String values[]=sc.nextLine().split(" ");
            BigDecimal r = new BigDecimal(values[0]);
            BigDecimal x = new BigDecimal(values[1]);
            BigDecimal result = r.multiply(r).multiply(new BigDecimal("22")).divide(new BigDecimal("7"),0,RoundingMode.HALF_UP);
            BigDecimal area=x.multiply(new BigDecimal("100"));
            if(area.compareTo(result)<=1){
                count++;
            }
        }
        System.out.println(count);
    }
}
