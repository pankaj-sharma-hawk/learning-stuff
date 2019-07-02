package thread;

import lombok.Data;

/**
 * Created by pankaj on 06,2019
 */
@Data
public class ThreadAC extends Thread {

  private int total = 0;

  @Override
  public void run() {
    synchronized (this) {
      for (int i = 0; i < 10; i++) {
        total += i;
      }
      notify();
    }

  }
}
