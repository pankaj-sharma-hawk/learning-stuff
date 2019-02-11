package hackerearth;

import java.util.Scanner;

/**
 * Created by pankaj on 01,2019
 */
public class CountDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l=sc.nextInt();
        int r=sc.nextInt();
        int k=sc.nextInt();
        int count=0;
        for(int i=l;i<=r;){
            if(i%k==0){
                count++;
                i=(i+k);
            }else{
                i++;
            }
        }
        System.out.println(count);
    }
}
