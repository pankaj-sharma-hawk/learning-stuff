package old.array;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by pankaj on 02,2019
 */
public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[]={1,5,2,0,25,-1,0,15};
        Stack<Integer> stack = new Stack();
        List<Value> list = new ArrayList();
        for(int i=0;i<arr.length;i++){
            if(!stack.isEmpty()){
                setNextGreaterElement(stack,arr[i],list);
            }
                stack.push(arr[i]);
        }
        if(!stack.isEmpty()){
            while (!stack.isEmpty()){
                list.add(new Value(stack.pop().toString(),"NA"));
            }
        }
        System.out.println(list);
    }

    private static void setNextGreaterElement(Stack<Integer> stack , Integer number , List<Value> list){
        while (!stack.isEmpty()){
            if(stack.peek()<number){
                list.add(new Value(stack.pop().toString(),number.toString()));
            }else{
                break;
            }
        }
    }
}
@Data
@AllArgsConstructor
class Value{
    private String value;
    private String greaterValue;

    @Override
    public String toString() {
        return "Value{" +
                "value='" + value + '\'' +
                ", greaterValue='" + greaterValue + '\'' +
                '}'+"\n";
    }
}