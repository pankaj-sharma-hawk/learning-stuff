package udemy.designpattern.factory;

import java.util.Random;

/**
 * Created by pankaj on 01,2019
 */
public class RectangleFactory {
    public static Rectangle newRectangle(int height,int width){
        return new Rectangle(width,height);
    }
    public static Rectangle newSquare(int size){
        return new Rectangle(size,size);
    }
}
