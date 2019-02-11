package hackerearth;

import java.util.Scanner;

/**
 * Created by pankaj on 01,2019
 */
public class PalindromicString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char str[]=sc.nextLine().toCharArray();
        if(isStringPalindrome(str)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
    public static boolean isStringPalindrome(char arr[]){
        int lastIndex=arr.length;
        int firstIndex=-1;
        while ((++firstIndex)<(--lastIndex)){
            if(arr[firstIndex]!=arr[lastIndex]){
                return false;
            }
        }
        return true;
    }
}
