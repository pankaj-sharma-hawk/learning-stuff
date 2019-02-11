package hackerearth;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by pankaj on 02,2019
 */
public class AliHelpingInnocentPeople {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char arr[]=sc.nextLine().toCharArray();
        List<Character> list = Arrays.asList('A','E','I','O','U','Y');
        //DD*DDD-DD
        int sum=0;
        sum=arr[0]-'0' + arr[1]-'0';
        if(sum%2==1){
            System.out.println("invalid");
        }else{
            if(list.contains(arr[2])){
               System.out.println("invalid");
            }else{
                sum=arr[3]-'0'+arr[4]-'0';
                if(sum%2==1){
                    System.out.println("invalid");
                }else{
                    sum=arr[4]-'0'+arr[5]-'0';
                    if(sum%2==1){
                        System.out.println("invalid");
                    }else {
                        sum=arr[7]-'0'+arr[8]-'0';
                        if(sum%2==1){
                            System.out.println("invalid");
                        }else{
                            System.out.println("valid");
                        }
                    }
                }
            }
        }

    }
}
