package hackerearth;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by pankaj on 01,2019
 */
public class TwoStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=Integer.parseInt(sc.nextLine());
        for(int i=0;i<size;i++){
            int countArray[]=new int[256];
            Arrays.fill(countArray,0);
            char a[]=sc.next().toCharArray();
            char b[]=sc.next().toCharArray();
            countArray=getCountArray(a,1,countArray);
            countArray=getCountArray(b,-1,countArray);
            if(checkCountArray(countArray)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }

    }

    public static int[] getCountArray(char input[],int increment,int countArray[]){
        for(int i=0;i<input.length;i++){
            countArray[input[i]]+=increment;
        }
        return countArray;
    }

    public static boolean checkCountArray(int countArray[]){
        for(int i=0;i<countArray.length;i++){
            if(countArray[i]!=0){
                return false;
            }
        }
        return true;
    }
}
