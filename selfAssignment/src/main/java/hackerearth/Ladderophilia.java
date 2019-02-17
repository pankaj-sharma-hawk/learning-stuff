package hackerearth;

import java.util.Scanner;

/**
 * Created by pankaj on 02,2019
 */
public class Ladderophilia {
    public static void main(String[] args) {
        String ladder="*   *\n" +
                      "*   *\n";
        String ladder1="*****\n";
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        for(int i=0;i<size;i++){
            System.out.print(ladder);
            System.out.print(ladder1);
        }
        System.out.print(ladder);

    }
}
