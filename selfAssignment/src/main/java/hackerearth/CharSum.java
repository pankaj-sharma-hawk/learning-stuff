package hackerearth;

import java.util.Scanner;

/**
 * Created by pankaj on 02,2019
 */
public class CharSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char arr[]=sc.nextLine().toCharArray();
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=(arr[i]-'a'+1);

        }
        System.out.println(sum);
    }
}
