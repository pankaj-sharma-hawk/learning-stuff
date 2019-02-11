package hackerearth.util;

/**
 * Created by pankaj on 02,2019
 */
public class SegmentTree {
    public Node addMinimumSegmentTree(int arr[]){
        return addMinimumSegmentTree(arr,0,arr.length-1);
    }

    public Node addSumSegmentTree(int arr[]){
        return addSumSegmentTree(arr,0,arr.length-1);
    }
    public Node addMinimumSegmentTree(int arr[], int startIndex, int endIndex){
        if(startIndex<=endIndex){
            if(startIndex==endIndex){
               return new Node(arr[startIndex],startIndex,endIndex);
            }
            int mid=(startIndex+endIndex)/2;
            Node left = addMinimumSegmentTree(arr,startIndex,mid);
            Node right= addMinimumSegmentTree(arr,mid+1,endIndex);

            int minData=left.getData()<right.getData()?left.getData():right.getData();
            //int sumData=left.getData()+right.getData();
            return new Node(minData,left.getStart(),right.getEnd(),left,right);
        }
        return null;
    }

    public Node addSumSegmentTree(int arr[],int startIndex,int endIndex){
        if(startIndex<=endIndex){
            if(startIndex==endIndex){
                return new Node(arr[startIndex],startIndex,endIndex);
            }
            int mid=(startIndex+endIndex)/2;
            Node left = addSumSegmentTree(arr,startIndex,mid);
            Node right= addSumSegmentTree(arr,mid+1,endIndex);
            int sumData=left.getData()+right.getData();
            return new Node(sumData,left.getStart(),right.getEnd(),left,right);
        }
        return null;
    }
    public void printTree(Node tree){
        if(tree==null)
            return;
        System.out.println(tree.getData());
        printTree(tree.getLeft());
        printTree(tree.getRight());
    }

    public int getMinimumValueRange(Node root,int left,int right){
        /**
         *
         * 1. Partial then check both side
         * 2. complete then return value
         * 3. Max Value when not in Range
         */
       if(checkPartialRange(root,left,right)){
           if(checkEqualRange(root,left,right)){
               return root.getData();
           }else {
               int leftMin=getMinimumValueRange(root.getLeft(),left,right);
               int rightMin=getMinimumValueRange(root.getRight(),left,right);

               return leftMin<rightMin?leftMin:rightMin;
           }

       }else{
           return Integer.MAX_VALUE;
       }


    }

    public int getSumValueRange(Node root,int left,int right){
        if(root!=null && checkPartialRange(root,left,right)){
            if(checkEqualRange(root,left,right)){
                return root.getData();
            }else {
               int leftSum=getSumValueRange(root.getLeft(),left,right);
               int rightSum=getSumValueRange(root.getRight(),left,right);
               if(leftSum==Integer.MIN_VALUE)
                   leftSum=0;
               if(rightSum==Integer.MIN_VALUE)
                   rightSum=0;
               return leftSum+rightSum;

            }

        }else{
            return Integer.MIN_VALUE;
        }
    }

    private boolean checkPartialRange(Node root,int left,int right){
      if(root.getStart()<=left && left<=root.getEnd() || root.getStart()<=right && right<=root.getEnd()){
            return true;
        }
        return false;
    }

    private boolean checkEqualRange(Node root,int left,int right){
        if((root.getStart()==left && root.getEnd()==right)|| ((root.getStart()==root.getEnd())&& ( (left==root.getStart()) || (right==root.getEnd()) ) )){
            return true;
        }
        return false;
    }
}
