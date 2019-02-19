package backtracking;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

/**
 * Created by pankaj on 02,2019
 */
@Getter
@Setter
public class RatMazeProblem {
    private int arr[][];
    private int size;

    public RatMazeProblem(int size) {
        this.size=size;
        arr=new int[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                arr[i][j]=0;
            }
        }
    }

    public boolean getRatMazePath(int maze[][], int starti,int startj){
        boolean result=false;
        if(starti+1==size && startj+1==size){
           arr[starti][startj]=1;
           return true;
       }
        else if(starti<size && startj<size && maze[starti][startj]==1){
           result=getRatMazePath(maze,starti,startj+1);
           if(!result){
               result=getRatMazePath(maze,starti+1,startj);
           }
           if(result){
               arr[starti][startj]=1;

           }

       }
       return result;
    }

    public boolean getRatMazePathFourDirection(int maze[][],int starti,int startj){
        if(starti==size && startj==size){
            return true;
        }else if(starti<0 || starti>size || startj<0 || startj>size){
            return false;
        }else if(maze[starti][startj]==0 || arr[starti][startj]==1){
            return false;
        }else{
            arr[starti][startj]=1;
            boolean result=getRatMazePathFourDirection(maze,starti,startj+1)||
                    getRatMazePathFourDirection(maze,starti,startj-1)||
                    getRatMazePathFourDirection(maze,starti+1,startj)||
                    getRatMazePathFourDirection(maze,starti-1,startj);
                if(!result){
                    arr[starti][startj]=0;
                }
                return result;
        }
    }

    public void printMazePath(){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
