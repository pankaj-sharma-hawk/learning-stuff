package hackerearth;

import java.util.Scanner;

/**
 * Created by pankaj on 01,2019
 */
public class EMazeIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char instruction[]=sc.nextLine().toCharArray();
        Point point = new Point(0,0);
        for(int i=0;i<instruction.length;i++){
           point.moveToNextPoition(instruction[i]);
        }
        System.out.println(point.getX()+" "+point.getY());
    }


}
class Point{
    private int x;
    private int y;

    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }


    public int getY() {
        return y;
    }

    public void moveToNextPoition(char instruction){
        if(instruction=='L'){
            x+=Direction.LEFT.getDirection().getX();
            y+=Direction.LEFT.getDirection().getY();
        }else if(instruction=='D'){
            x+=Direction.DOWN.getDirection().getX();
            y+=Direction.DOWN.getDirection().getY();
        }else if(instruction=='U'){
            x+=Direction.UP.getDirection().getX();
            y+=Direction.UP.getDirection().getY();
        }else{
            x+=Direction.RIGHT.getDirection().getX();
            y+=Direction.RIGHT.getDirection().getY();
        }
    }
}

enum Direction {

    LEFT(new Point(0,-1)),
    RIGHT(new Point(0,1)),
    UP(new Point(-1,0)),
    DOWN(new Point(1,0));

    private final Point point;


    Direction(final Point point){
        this.point=point;
    }


    public Point getDirection(){
        return point;
    }

};
