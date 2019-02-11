package hackerearth;

import java.util.Scanner;

/**
 * Created by pankaj on 02,2019
 */
public class BookPotionMaking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char arr[]=sc.nextLine().toCharArray();
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+(arr[i]-'0')*(i+1);
        }
        if(sum%11==1 || arr.length!=10){
            System.out.println("Illegal ISBN");
        }else{
            System.out.println("Legal ISBN");
        }
    }
}
