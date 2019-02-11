package hackerearth;

import java.sql.Time;
import java.util.Scanner;

/**
 * Created by pankaj on 02,2019
 */
public class Duration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            String arr[]=sc.nextLine().split(" ");
            int startTime=getTotalMinutes(Integer.parseInt(arr[0]),Integer.parseInt(arr[1]));
            int endTime=getTotalMinutes(Integer.parseInt(arr[2]),Integer.parseInt(arr[3]));
            System.out.println(getTimeDifference(startTime,endTime));
        }
    }
    public static int getTotalMinutes(int hours,int minutes){
        return hours*60+minutes;
    }

    public static String getTimeDifference(int startTime,int endTime){
        int diffTime=endTime-startTime;
        Integer diffMin=diffTime%60;
        Integer diffHour=diffTime/60;
        return diffHour.toString()+" "+diffMin.toString();
    }
}
