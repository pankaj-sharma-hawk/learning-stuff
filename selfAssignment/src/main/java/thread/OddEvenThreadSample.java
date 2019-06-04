package thread;

/**
 * Created by pankaj on 06,2019
 */
public class OddEvenThreadSample {

  public static void main(String[] args) {
    OddEvenThread oddEvenThread = new OddEvenThread();
    oddEvenThread.setMutex(false);
    Thread t1 = new Thread(new Runnable() {
      @Override
      public void run() {
        oddEvenThread.oddNumber();
      }
    });
    Thread t2 = new Thread(new Runnable() {
      @Override
      public void run() {
        oddEvenThread.evenNumber();
      }
    });
    t1.start();
    t2.start();

  }

}

class OddEvenThread {

  static int count = 1;
  static int MAX_COUNT = 20;
  private boolean mutex;

  public void oddNumber() {
    synchronized (this) {
      while (count < MAX_COUNT) {
        System.out.println("Odd Number:---");
        System.out.println(count);
        while (mutex) {
          try {
            wait();
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
        System.out.println("Number:--"+count);
        mutex=true;
        count++;
        notify();

      }
    }

  }

  public void evenNumber() {
    synchronized (this) {
      while (count < MAX_COUNT) {
        System.out.println("Even Number:---");
        while (!mutex) {
          try {
            wait();
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
        System.out.println("Number:-"+count);
        mutex=false;
        count++;
        notify();
      }
    }
  }

  public void setMutex(boolean mutex) {
    this.mutex = mutex;
  }
}
