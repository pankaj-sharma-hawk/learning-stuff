package old.array;

import java.util.Arrays;

/**
 * Created by pankaj on 02,2019
 */
public class QuickSort {
    public static void main(String[] args) {
        int arr[]={5,6,10,4,5,3};
        QuickSort quickSort = new QuickSort();
        System.out.println(Arrays.toString(arr));
        quickSort.quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    private void quickSort(int arr[],int startIndex,int endIndex){
        if(startIndex<endIndex){
            int pivtIndex=getPivetIndex(arr,startIndex,endIndex);
            quickSort(arr,startIndex,pivtIndex-1);
            quickSort(arr,pivtIndex+1,endIndex);
        }
    }
    private int getPivetIndex(int arr[],int startIndex,int endIndex){
      int pvtElement=arr[endIndex];
      int i=(startIndex-1);
      for(int j=startIndex;j<endIndex;j++){
            if(arr[j]<pvtElement){
                i++;
                swap(arr,i,j);
            }
      }
      swap(arr,i+1,endIndex);
      return i+1;

    }


    private void swap(int arr[],int firstIndex,int secondIndex){
        int temp=arr[firstIndex];
        arr[firstIndex]=arr[secondIndex];
        arr[secondIndex]=temp;
    }
}