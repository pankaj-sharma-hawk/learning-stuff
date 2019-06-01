package old.array;

/**
 * Created by pankaj on 02,2019
 */
public class MaximumSumSubArray {
    public static void main(String[] args) {
        //int arr[]={1,5,-10,-11,-1,5,20,-2,2,7};
        int arr[]={-1,-5,-7,-15,-65};
        int result = getMaxSumArray(arr);
        if(result==0){
            int result2 = getMaxValueForNegative(arr);
            if(result==result2){
                System.out.println(result);
            }else{
                System.out.println(result2);
            }
        }else {
            System.out.println(result);
        }

    }

    private static int getMaxSumArray(int arr[]){
        int maxValue=0;
        for(int i=0;i<arr.length;i++){
            if(maxValue>=0)
                maxValue+=arr[i];
            if(maxValue < 0)
                maxValue=0;

        }
        return maxValue;
    }
    private static int getMaxValueForNegative(int arr[]){
        int maxValue=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(maxValue<arr[i]){
                maxValue=arr[i];
            }
        }
        return maxValue;
    }
}
