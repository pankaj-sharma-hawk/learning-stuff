package hackerearth;

import java.util.Scanner;

/**
 * Created by pankaj on 01,2019
 */
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=1;i<=N;i++){
            if(isPrimeNumber(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean isPrimeNumber(int number){
        if(number==1 || number==0){
            return false;
        }
        if(number==2){
            return true;
        } if(number%2==0){
            return false;
        }
        else{
            int size= (int) Math.sqrt(number);
            for(int i=3;i<=size;i+=2){
                if(number%i==0){
                    return false;
                }
            }
            return true;
        }
    }
}
