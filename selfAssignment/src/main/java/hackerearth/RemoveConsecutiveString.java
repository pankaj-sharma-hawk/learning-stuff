package hackerearth;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by pankaj on 03,2019
 */
public class RemoveConsecutiveString {

  public static void main(String[] args) {
   /* System.out.println(process_String("dcaabbbaaccd"));
    System.out.println(process_String("abbbcccb"));
    System.out.println(process_String("aabbbcba"));
    System.out.println(process_String("aaabbaaaba"));
    System.out.println(process_String("aaabbaabbabbbaa"));
    System.out.println(process_String("aaa"));*/
    System.out.println(process_String("aabbbcba"));
  }

  private static String process_String(String input){
    char arr[]=input.toCharArray();
    Stack<ConString> stack=new Stack();
    stack.push(new ConString(arr[0],1));
    for(int i=1;i<arr.length;){

      if(!stack.isEmpty() && arr[i]==stack.peek().ch){
        stack.push(new ConString(arr[i],stack.peek().count+1));
      }else{
        if(!stack.isEmpty() && stack.peek().count>=3){
          removeThreeCharacter(stack,stack.peek().count);
          continue;
        }
        stack.push(new ConString(arr[i],1));
      }
      i++;
    }
    if(!stack.isEmpty() && stack.peek().count>=3){
      removeThreeCharacter(stack,stack.peek().count);
    }
    StringBuilder sb=new StringBuilder();
    while (!stack.isEmpty()){
      sb.append(stack.pop().ch);
    }
    return sb.reverse().toString();
  }

  private static void removeThreeCharacter(Stack<ConString> stack, int length){
    for(int i=0;i<length;i++){
      stack.pop();
    }
    List<ConString> list = new ArrayList();

  }

}
class ConString{
  public char ch;
  public int count;
  public ConString(char ch,int count){
    this.ch=ch;
    this.count=count;
  }
}
