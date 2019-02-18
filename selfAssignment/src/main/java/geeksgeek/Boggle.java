package geeksgeek;

/**
 * Created by pankaj on 02,2019
 */
public class Boggle {
    private static char boggle[][]   = {{'G','I','Z'},
            {'U','E','K'},
            {'Q','S','E'}
    };
    public static void main(String[] args) {
        String dictionary[]={"GEEKS","FOR","QUIZ","GO"};
        int visitedArray[][]=new int[boggle.length][boggle.length];
        for(int i=0;i<boggle.length;i++){
            for(int j=0;j<boggle.length;j++){
                visitedArray[i][j]=0;
            }
        }

        for(int i=0;i<dictionary.length;i++){
            char arr[]=dictionary[i].toCharArray();
            int row=boggle.length;
            int colIndex=-1;
            int rowIndex=-1;
            for(int j=0;j<row;j++){
                colIndex=new Boggle().getColoumnIndex(j,boggle[j].length,arr[0]);
                if(colIndex!=-1){
                    rowIndex=j;
                    break;
                }
            }
            if(new Boggle().isStringAvailable(rowIndex,colIndex,arr,0,row,visitedArray)){
                System.out.println(dictionary[i]);
            }

        }
    }

    private int getColoumnIndex(int rowIndex,int colSize,char firstChar){
        for(int i=0;i<colSize;i++){
            if(boggle[rowIndex][i]==firstChar){
                return i;
            }
        }
        return -1;
    }


    private boolean isStringAvailable(int rowIndex,int colIndex,char word[],int wordIndex,int size,int [][] visitedArray){
        if(word.length==wordIndex){
            return true;
        }
        else if(rowIndex<0 || colIndex<0 ||rowIndex>=size || colIndex>=size || word[wordIndex]!=boggle[rowIndex][colIndex] || visitedArray[rowIndex][colIndex]==1){
            return false;
        }else {
            visitedArray[rowIndex][colIndex]=1;
            return (
                    //-1,0
              isStringAvailable(rowIndex-1,colIndex,word,wordIndex+1,size,visitedArray) ||
               //1,0
              isStringAvailable(rowIndex+1,colIndex,word,wordIndex+1,size,visitedArray)||
              //0,1
              isStringAvailable(rowIndex,colIndex+1,word,wordIndex+1,size,visitedArray)||
             //-1,1
              isStringAvailable(rowIndex-1,colIndex+1,word,wordIndex+1,size,visitedArray)||
            //1 1
              isStringAvailable(rowIndex+1,colIndex+1,word,wordIndex+1,size,visitedArray)||
           //0,-1
              isStringAvailable(rowIndex,colIndex-1,word,wordIndex+1,size,visitedArray)||
            //-1,-1
              isStringAvailable(rowIndex-1,colIndex-1,word,wordIndex+1,size,visitedArray)||
            // 1,-1
              isStringAvailable(rowIndex+1,colIndex-1,word,wordIndex+1,size,visitedArray)


            );
        }

    }

}
