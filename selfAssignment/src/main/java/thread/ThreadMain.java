package thread;

/**
 * Created by pankaj on 01,2019
 */
public class ThreadMain {
    public static void main(String[] args) throws InterruptedException {
        Object object = new Object();
         Thread t2 = new Thread(new WaitingThread(object));
        Thread t1 = new Thread(new MainThread(object));
        t1.start();
        t2.start();

        t1.join();
        t2.join();

    }
}


class MainThread implements Runnable{

    private Object object;
    public MainThread(Object object){
        this.object=object;
    }

    public void run() {
        System.out.println("Main Thread");
        try {
        synchronized (object){
            System.out.println("Inside Main Sync:--");
                object.wait();
                System.out.println("After Wait Method:---"+MessageData.data);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Continue with Main Work");
    }
}


class WaitingThread implements Runnable{

    private Object object;

    public WaitingThread(Object object){
        this.object=object;
    }
    public void run() {
        boolean mutex=true;

        for(int i=0;i<10;i++){
            int result=HelpingFunction.getResult(i);
                if(result==2 && mutex) {
                    synchronized (object) {
                        mutex = false;
                        System.out.println("Inside Waiting Thead:---");
                        object.notify();
                        MessageData.data="Pankaj";
                }
            }
                System.out.println("End Waiting Thead:---");
        }

    }

}



class HelpingFunction{
    public static int getResult(int i){
        System.out.println("Inside Helping Function:---");
        return i;
    }
}