package sample;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pankaj on 01,2019
 */
public class TestCode {
    public static void main(String[] args) {
        String strArr[]=new String[] {"(2,1)", "(5,3)", "(6,3)", "(8,4)", "(3,4)", "(1,8)", "(7,7)", "(5,8)"};
        List<Point> list = new ArrayList();
        for(int i=0;i<strArr.length;i++){

            list.add(getPoints(strArr[i].toCharArray()));
        }

        ChessBoard chessBoard = new ChessBoard(9);
        setChessBoard(list,chessBoard.getArr());

        System.out.println(getResult(chessBoard,list));

    }

    public static Point getPoints(char arr[]){
        int x=-1,y=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] >= 48 && arr[i]<=57){
                if(x==-1){
                    x=arr[i]-48;
                }
                else if(y==-1){
                    y=arr[i]-48;
                }
            }
        }
        return new Point(x,y);
    }

    public static void setChessBoard(List<Point> list,int arr[][]){
        for(Point point:list){
            arr[point.getX()][point.getY()]=1;
        }
    }

    public static String getResult(ChessBoard chessBoard,List<Point> list){
        StringBuilder stringBuilder = new StringBuilder();
        boolean result=true;
        for(Point point : list){
            if(!chessBoard.IsQueenSafe(point.getX(),point.getY())){
                stringBuilder.append("("+point.getX()+","+point.getY()+")");
                result=false;
                break;
            }
        }
        if(result){
            stringBuilder.append("true");
        }
        return stringBuilder.toString();
    }
}
