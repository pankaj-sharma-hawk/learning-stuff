package string;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by pankaj on 02,2019
 */
public class NoRepeatingCharacterInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char arr[]=sc.nextLine().toCharArray();
        int countArray[]=new int[256];
        Arrays.fill(countArray,0);
        for(int i=0;i<arr.length;i++){
            countArray[arr[i]]++;
        }
        for(int i=0;i<arr.length;i++){
            if(countArray[arr[i]]==1){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}

