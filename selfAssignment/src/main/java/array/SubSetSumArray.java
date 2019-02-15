package array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pankaj on 02,2019
 */
public class SubSetSumArray {
    public static void main(String[] args) {
        //int arr[]={0,2,3,7,8,11};
        int arr[] = {2, 3, 5, 6, 8, 10};
        int sum=10;
        SubSetSumArray subSetSumArray = new SubSetSumArray();
        System.out.println(subSetSumArray.getSubSetOfSum(arr,sum));

    }

    private List<Integer> getSubSetOfSum(int [] arr,int sum){
        boolean dpArray[][]=initDynamicArray(arr, sum);
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<=sum;j++){
                if(j==0)
                    dpArray[i][j]=true;
                else{
                    if(j==arr[i]){
                        dpArray[i][j]=true;
                    }else if((i-1)>=0 && dpArray[i-1][j]){
                        dpArray[i][j]=dpArray[i-1][j];
                    }else if((j-arr[i])>0 && (i-1)>0){
                        dpArray[i][j]=dpArray[i-1][j-arr[i]];
                    }else{
                        dpArray[i][j]=false;
                    }
                }
            }
        }

    return findListOfSet(dpArray,arr);

    }

    private List<Integer> findListOfSet(boolean [][]arr,int valueArray[]){
        int row=arr.length-1;
        int col=arr[0].length-1;
        List<Integer> list = new ArrayList();
        while (row!=0 && col !=0){
            if(arr[row-1][col]){
                row--;
            }else{
                if(arr[row][col]) {
                    list.add(valueArray[row]);
                    col = col - valueArray[row--];
                }else {
                    break;
                }
            }
        }
        return list;
    }
    private boolean [][] initDynamicArray(int [] arr ,int sum){
        boolean dp[][]=new boolean[arr.length][sum+1];
        return dp;
    }
}
