package sample;

/**
 * Created by pankaj on 06,2019
 */
public class Inheritance {

  public static void main(String[] args) {
    Parent parent = new Parent();
  }
}

abstract class ABS{
  public ABS(){
    System.out.println("ABS");
  }
}

class Parent extends ABS{

  public Parent(){
    System.out.println("PARENT");
  }
  public void show(){
  }

  protected void display(){

  }

  private void print(){

  }
}
class Child extends Parent{
  @Override
  public void show(){

  }

  @Override
  public void display(){

  }
  /*@Override
  public void print(){

  }*/
}
