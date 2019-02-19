package backtracking;

/**
 * Created by pankaj on 02,2019
 */
public class BackTrackingMain {
    public static void main(String[] args) {
        int maze[][]={  {1, 0, 0, 0},
                        {1, 1, 0, 1},
                        {0, 1, 0, 0},
                        {1, 1, 1, 1}};
        int size=4;
        RatMazeProblem ratMazeProblem = new RatMazeProblem(size);
       /* ratMazeProblem.getRatMazePath(maze,0,0);
        ratMazeProblem.printMazePath();*/

        ratMazeProblem.getRatMazePathFourDirection(maze,0,0);
        ratMazeProblem.printMazePath();


    }
}
