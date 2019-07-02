package lamda;

import java.util.Arrays;
import java.util.List;

/**
 * Created by pankaj on 06,2019
 */
public class LamdaTraining {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    int sum = 0;
    for (int value : numbers) {
      if (value % 2 == 0) {
        sum = sum + (value * 2);
      }
    }
    System.out.println(sum);

    Integer result = numbers.stream().filter(value -> (value % 2 == 0)).map(value -> (value * 2))
        .reduce(0, Integer::sum);

    result = numbers.stream().filter(value -> (value % 2 == 0)).mapToInt(value -> (value * 2))
        .sum();

    System.out.println(result);

    List<String> stringValues = Arrays.asList("Pa", "Pankaj", "Sh", "Shashank", "Narh");
    Integer maxValue = Integer.MIN_VALUE;
    String resultValue = null;
    for (String st : stringValues) {
      if (st.length() > maxValue) {
        maxValue = st.length();
        resultValue = st;
      }
    }
    System.out.println(resultValue);

    Integer maxNewValue=Integer.MIN_VALUE;
    String result1="";
    //stringValues.stream().filter(e->(e.length()>maxNewValue)).collect(result1::new)
  }

  public void show(Integer value) {
    System.out.println(value);
  }

}
