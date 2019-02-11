package hackerearth;

import java.util.Scanner;

/**
 * Created by pankaj on 02,2019
 */
public class LifeUniverseEverything {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean result=true;
        while (result){
            int value=Integer.parseInt(sc.nextLine());
            if(value==42){
                result=false;
            }else {
                System.out.println(value);
            }

        }
    }
}
