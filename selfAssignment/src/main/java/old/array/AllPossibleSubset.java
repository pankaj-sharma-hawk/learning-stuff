package old.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pankaj on 02,2019
 */
public class AllPossibleSubset {
    public static void main(String[] args) {
        int arr[] = {2, 3, 5};
        List<List<Integer>> lists = new ArrayList();
        int size= (int) Math.pow(2,arr.length);
        for(int i=0;i<size;i++){
            int number=i;
            int index=0;
            List<Integer> list = new ArrayList();
            while(number !=0){
                int result = number & 1;
                if(result!=0){
                        list.add(arr[index]);
                }
                index++;
                number=number>>1;
            }
            lists.add(list);
        }
        System.out.println(lists);

    }
}
