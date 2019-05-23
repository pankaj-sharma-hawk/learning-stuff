package hackerearth;

/**
 * Created by pankaj on 04,2019
 */
public class ConverterEuro {

  public static void main(String[] args) {

  }

  public String convertIntoEuro(double rupees){
    long amount= (long) rupees;
    double x = rupees - Math.floor(rupees);
    /**
     *
     *  1  m = 1000000
     *  10 m = 10000000
     * 100 m = 100000000
     * 1 b   = 1000000000
     * 10 b  = 10000000000
     * 100 b = 100000000000
     * */

    int div= (int) Math.pow(10,11);
    int result= (int) (amount/div);
    StringBuilder sb = new StringBuilder();
    if(result!=0){
      div=div/100;

      amount=amount%div;
      sb.append(result+" billon");
    }
    div= (int) Math.pow(10,10);
    result= (int) (amount/div);
    if(result!=0){
      amount=amount%div;
      sb.append(result+" billon");
    }
    div= (int) Math.pow(10,9);
    result= (int) (amount/div);
    if(result!=0){
      amount=amount%div;
      sb.append(result+" billon");
    }
    div= (int) Math.pow(10,8);
    result= (int) (amount/div);
    if(result!=0){
      amount=amount%div;
      sb.append(result+" millon");
    }
    div= (int) Math.pow(10,7);
    result= (int) (amount/div);
    if(result!=0){
      amount=amount%div;
      sb.append(result+" millon");
    }
    div= (int) Math.pow(10,6);
    result= (int) (amount/div);
    if(result!=0){
      amount=amount%div;
      sb.append(result+" millon");
    }
    div= (int) Math.pow(10,5);
    result= (int) (amount/div);
    if(result!=0){
      amount=amount%div;
      sb.append(result+" thousand");
    }
    sb.append(amount);
    sb.append(" euro");
    return null;
  }

}
