package hackerearth;

import java.util.Scanner;

/**
 * Created by pankaj on 02,2019
 */
public class GokiAndBreakUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        int x=Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            int y=Integer.parseInt(sc.nextLine());
            if((y-x)>=0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
