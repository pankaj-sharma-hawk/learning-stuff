package hackerearth;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by pankaj on 01,2019
 */
public class FindProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        long ans=1;
        BigInteger answer = new BigInteger("1");
        FindProduct obj = new FindProduct();
        BigInteger modolu=new BigInteger("1000000007");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            BigInteger value=new BigInteger(Integer.toString(arr[i]));
            answer=answer.multiply(value).mod(modolu);
        }
        System.out.println(answer);

    }

}
