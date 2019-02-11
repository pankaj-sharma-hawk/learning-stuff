package hackerearth;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by pankaj on 01,2019
 */
public class StringAlpha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string=sc.nextLine();
        String result=null;
        boolean isResult=true;
        while (isResult){
            //string=removeOccurenceString(string);
            result=checkString(string);
            if(result.equals(string)){
                isResult=false;
            }
            if(result.isEmpty()){
                isResult=false;
            }else {
                string = new String(result);
            }
        }
        if(result.isEmpty()){
            System.out.println("");
        }else {
            System.out.println(string);
        }

    }

        public static String checkString(String input){
            char arr[]=input.toCharArray();
            StringBuilder sb = new StringBuilder();
            boolean flag=false;
            for(int i=0;i<arr.length;){
                int j=i+1;
                flag=false;
                for(;j<arr.length;){
                    //char temp= (char) (arr[j-1]+1);
                    if((arr[j]-arr[j-1])==1){
                        j++;
                        flag=true;
                    }else{
                        break;
                    }
                }
                int index = i;
                if(!flag) {
                        sb.append(arr[i++]);
                }else{
                    /***Skipping Character **/
                    while (index < j) {
                        i++;
                        index++;
                    }
                }
            }
            return sb.toString();
        }

        public static String removeOccurenceString(String input){
            Stack<Character> stack = new Stack();
            char arr[]=input.toCharArray();
            stack.add(arr[0]);
            for(int i=1;i<arr.length;i++){
                if(!stack.peek().equals(arr[i])){
                    stack.push(arr[i]);
                }
            }
            StringBuilder sb = new StringBuilder();
            while (!stack.isEmpty()){
                sb.append(stack.pop());
            }
            return sb.reverse().toString();
        }
}
