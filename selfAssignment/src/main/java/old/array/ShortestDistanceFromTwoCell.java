package old.array;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by pankaj on 02,2019
 */
public class ShortestDistanceFromTwoCell {
    static boolean visited[][]=new boolean[4][4];
   static int cost[][]=new int[4][4];
    static int size=4;
    public static void main(String[] args) {
        char path[][]={  {'0', '*', '0', 's'},
                {'*', '0', '*', '*'},
                {'0', '*', '*', '*'},
                {'d', '0', '0', '0'}};
        /** Find Source Index**/
        int row=path.length;
        int col=path[0].length;
        int si=-1,sj=-1,di=-1,dj=-1;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(path[i][j]=='s'){
                    si=i;
                    sj=j;

                }
                if(path[i][j]=='d'){
                    di=i;
                    dj=j;
                }
            }
            if(si!=-1 && sj!=-1 && di!=-1 && dj!=-1)
                break;
        }
        System.out.println(isPathAvailable(si,sj,di,dj,path));


    }

    private static int isPathAvailable(int si,int sj,int di,int dj,char [][] path){
        Queue<CellNode> queue = new ArrayDeque();
        queue.add(new CellNode(si,sj,1));
        int minCellCost=Integer.MAX_VALUE;
        while (!queue.isEmpty()){
            CellNode cellNode = queue.poll();
            int i=cellNode.getI();
            int j=cellNode.getJ();
            int cost=cellNode.getCellCost();
            if(i==di && j==dj){
                if(minCellCost>cost){
                    minCellCost=cost;
                }
            }
            visited[i][j]=true;
            if((i-1)>=0 && i<size  && path[i-1][j]!='0' && !visited[i-1][j]){
                queue.add(new CellNode(i-1,j,cost+1));
            }
            if(i>=0 && (i+1)<size && path[i+1][j]!='0' && !visited[i+1][j]){
                queue.add(new CellNode(i+1,j,cost+1));
            }
            if((j-1)>=0 && i<size && path[i][j-1]!='0' && !visited[i][j-1]){
                queue.add(new CellNode(i,j-1,cost+1));
            }
            if(j>=0 && (j+1)<size && path[i][j+1]!='0' && !visited[i][j+1]){
                queue.add(new CellNode(i,j+1,cost+1));
            }

        }
        if(minCellCost==Integer.MAX_VALUE)
            return -1;
        return minCellCost-1;

    }
}
@Data
@AllArgsConstructor
class CellNode{
    private int i;
    private int j;
    private int cellCost;
}
