package sample;

import java.util.Arrays;

/**
 * Created by pankaj on 01,2019
 */
public class ChessBoard {
    private int arr[][];

    private int heigth;
    private int width;

    public ChessBoard(int size){
        width=heigth=size;
        arr=new int[heigth][width];
        for(int i=0;i<9;i++){
            Arrays.fill(arr[i],-1);
        }
    }

    public int[][] getArr() {
        return arr;
    }

    private boolean checkQueenTop(int x,int y){
        boolean result=false;
        for(int i=x-1;i>0;i--){
            if(arr[i][y]!=-1){
                result=true;
                break;
            }
        }
        return result;
    }

    private boolean checkQueenBottom(int x,int y){
        boolean result=false;
        for(int i=x+1;i<9;i++){
            if(arr[i][y]!=-1){
                result=true;
                break;
            }
        }
        return result;
    }

    private boolean checkQueenFront(int x,int y){
        boolean result=false;
        for(int i=y+1;i<9;i++){
            if(arr[x][i]!=-1){
                result=true;
                break;
            }
        }
        return result;
    }

    private boolean checkQueenRear(int x,int y){
        boolean result=false;
        for(int i=y-1;i>0;i--){
            if(arr[x][i]!=-1){
                result=true;
                break;
            }
        }
        return result;
    }
    private boolean checkQueenRightBottom(int x,int y){
        boolean result=false;
        for(int i=x+1,j=y+1;i<9&&j<9;i++,j++){
            if(arr[i][j]!=-1){
                result=true;
                break;
            }
        }
        return result;
    }

    private boolean checkQueenLeftTop(int x,int y){
        boolean result=false;
        for(int i=x-1,j=y-1;i>0&&j>0;i--,j--){
            if(arr[i][j]!=-1){
                result=true;
                break;
            }
        }
        return result;
    }

    private boolean checkQueenRightTop(int x,int y){
        boolean result=false;
        for(int i=x-1,j=y+1;i>0&&j<9;i--,j++){
            if(arr[i][j]!=-1){
                result=true;
                break;
            }
        }
        return result;
    }
    private boolean checkQueenLeftBottom(int x,int y){
        boolean result=false;
        for(int i=x+1,j=y-1;i<9&&j>0;i++,j--){
            if(arr[i][j]!=-1){
                result=true;
                break;
            }
        }
        return result;
    }

    public boolean IsQueenSafe(int x,int y){
        return !(checkQueenBottom(x,y) ||
                checkQueenTop(x,y)||
                checkQueenFront(x,y)||
                checkQueenRear(x,y)||
                checkQueenLeftTop(x,y)||
                checkQueenLeftBottom(x,y)||
                checkQueenRightTop(x,y)||
                checkQueenRightBottom(x,y)
                );
    }

}
