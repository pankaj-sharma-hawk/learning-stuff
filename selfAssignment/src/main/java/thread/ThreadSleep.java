package thread;

import java.util.StringJoiner;

/**
 * Created by pankaj on 06,2019
 */
public class ThreadSleep {

  public static void main(String[] args) {
    Thread t = new Thread(new MyThread(), "First");
    Thread t1 = new Thread(new MyThread(), "Second");
    t.start();
    t1.start();
  }
}

class MyThread implements Runnable {

  @Override
  public void run() {
    StringJoiner stringJoiner = new StringJoiner(",");
    for (int i = 1; i <= 100; i++) {
      if (i % 10 == 0) {
        try {
          Thread.sleep(1000l);
          System.out.println(Thread.currentThread().getName() + "-:-" + stringJoiner);
          stringJoiner = new StringJoiner(",");
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
      stringJoiner.add(i + "");
    }
  }
}