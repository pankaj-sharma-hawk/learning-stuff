package string;

import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by pankaj on 02,2019
 */
public class RemoveReplaceCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char arr[]=sc.nextLine().toCharArray();
        List<Character> list = new ArrayList();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='c'){
                list.add('*');
                list.add('*');
            }else{
                list.add(arr[i]);
            }
        }
        StringBuilder sb = new StringBuilder();
      list.stream().forEach(t->sb.append(t));
      System.out.print(sb.toString());
    }
}
