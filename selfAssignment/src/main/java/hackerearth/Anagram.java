package hackerearth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by pankaj on 01,2019
 */
public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase=Integer.parseInt(sc.nextLine());
        while(testCase-->0){
            char a[]=sc.nextLine().toCharArray();
            char b[]=sc.nextLine().toCharArray();
            int countA[]=new int[256];
            Arrays.fill(countA,0);
            for(int i=0;i<a.length;i++){
                int index=a[i];
                countA[index]++;
            }
            for(int i=0;i<b.length;i++){
                int index=b[i];
                countA[index]--;
            }
            System.out.println(getNumberOfStep(countA));

        }

        List<Float> list =new ArrayList();
        list.add(12.34f);
        list.add(45.89f);
        String result = list.stream().map(Object::toString).collect(Collectors.joining(","));
        System.out.println(result);
    }
    public static int getNumberOfStep(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum = sum + ((arr[i] > 0) ? arr[i] : ((-1) * arr[i]));
        }
        return sum;

    }
}
