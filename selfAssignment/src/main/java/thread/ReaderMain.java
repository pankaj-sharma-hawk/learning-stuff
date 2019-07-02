package thread;

/**
 * Created by pankaj on 06,2019
 */

public class ReaderMain {

  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    new Reader(calculator).start();
    new Reader(calculator).start();
    new Reader(calculator).start();
    calculator.start();
  }
}

class Reader extends Thread {

  private Calculator calculator;

  public Reader(Calculator calculator) {
    this.calculator = calculator;
  }

  @Override
  public void run() {
    synchronized (calculator) {
      try {
        calculator.wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println("Calculator Total:--" + calculator.total);
    }
  }
}

class Calculator extends Thread {

  public int total = 0;

  @Override
  public void run() {
    synchronized (this) {
      System.out.println("Start Calcultor:----");
      this.notify();
      for (int i = 0; i < 100; i++) {
        total += i;
      }

      try {
        Thread.sleep(3000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println("End Calculator:-----");

    }
  }
}
