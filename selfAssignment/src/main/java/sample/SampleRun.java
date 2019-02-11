package sample;

import udemy.designpattern.Sample;

/**
 * Created by pankaj on 01,2019
 */
public class SampleRun extends Anujesh{
    public static void main(String[] args) {
        Anujesh anujesh = new SampleRun();
        Anujesh.print();
    }

    @Override
    public void show() {
        System.out.println("SampleRun");
    }
}
