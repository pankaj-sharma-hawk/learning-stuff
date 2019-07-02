package thread;

/**
 * Created by pankaj on 06,2019
 */
public class ThreadAB {

  public static void main(String[] args) {
    ThreadAC b  = new ThreadAC();
    b.start();
    synchronized (b){
      try {
        b.wait();
        System.out.println(b.getTotal());
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
