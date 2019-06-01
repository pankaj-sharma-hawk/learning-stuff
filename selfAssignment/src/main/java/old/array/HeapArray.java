package old.array;

import java.util.Arrays;

/**
 * Created by pankaj on 02,2019
 */
public class HeapArray {
    public static void main(String[] args) {
        int arr[]={12, 11, 13, 5, 6, 7};
        HeapArray heapArray = new HeapArray();
        System.out.println(Arrays.toString(arr));
        heapArray.buildMaxHeap(arr);
        System.out.println(Arrays.toString(arr));
        heapArray.heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /** Max Heapfiy **/
    private void heapfiy(int arr[],int index,int size){
        int left=left(index);
        int right=right(index);

            int maxIndex = (left <size && arr[left] > arr[index]) ? left : index;
                maxIndex=(right < size && arr[right] > arr[maxIndex])?right:maxIndex;

            swap(arr, index, maxIndex);

            if (index != maxIndex)
                heapfiy(arr, maxIndex,size);

    }

    private int left(int i){
        return 2*i+1;
    }

    private int right(int i){
        return 2*i+2;
    }

    private int findParent(int nodeIndex){
        return (int) Math.floor(nodeIndex/2)-1;
    }

    private void buildMaxHeap(int [] arr){
        int parentIndex=findParent(arr.length);
        for(int i=parentIndex;i>=0;i--){
                heapfiy(arr,i,arr.length);
        }
    }

    private void swap(int arr[],int left,int right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }

    public void heapSort(int arr[]){
        int lastIndex=arr.length-1;
        for(int i=lastIndex;i>=0;i--){
            swap(arr,0,i);
            heapfiy(arr,0,i);
        }


    }

}
