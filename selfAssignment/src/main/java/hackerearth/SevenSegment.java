package hackerearth;

import java.util.Scanner;

/**
 * Created by pankaj on 02,2019
 */
public class SevenSegment {
    public static void main(String[] args) {
        int arr[]={6,2,5,5,4,5,6,3,7,6};
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        while(n-->0){
            char[] charArray=sc.nextLine().toCharArray();
            int sum=0;
            for(int i=0;i<charArray.length;i++){
                sum=sum+arr[charArray[i]-'0'];
            }
            System.out.println(new SevenSegment().getMaxValue(arr,sum));
        }
    }
    private int getMaxValue(int arr[],int number){
        StringBuilder sb=new StringBuilder();
        if(number%2==1){
            sb.append("7");
            number-=3;
        }
        while (number>=2){
            sb.append("1");
            number-=2;
        }
        return Integer.parseInt(sb.toString());
    }
}
