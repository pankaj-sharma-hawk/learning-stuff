package hackerearth;

import java.util.Scanner;

/**
 * Created by pankaj on 01,2019
 */
public class RoyProfilePicture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l=Integer.parseInt(sc.nextLine());
        int n=Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            int w=sc.nextInt();
            int h=sc.nextInt();
            if(l>h || l>w){
                System.out.println("UPLOAD ANOTHER");
            }else if(l<=h&&l<=w){
                if(h==w){
                    System.out.println("ACCEPTED");
                }else{
                    System.out.println("CROP IT");
                }
            }
        }
    }
}
