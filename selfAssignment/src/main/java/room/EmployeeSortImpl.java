package room;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by pankaj on 05,2019
 */
public class EmployeeSortImpl {

  public static void main(String[] args) {
    List<EmployeeDto> employeeDtoList = new ArrayList<>();
    for (int i = 1; i <= 5; i++) {
      EmployeeDto employeeDto = null;
      if (i % 2 == 0) {
        employeeDto = new EmployeeDto("Pankaj_" + i, 2147483647 );
      } else {
        employeeDto = new EmployeeDto("Pankaj_" + i, 2147483600);
      }
      employeeDtoList.add(employeeDto);
    }
    System.out.println(employeeDtoList);
    //employeeDtoList.sort(sortEmployee( (a,b)-> (a.getSalary()-b.getSalary())));
   Collections.sort(employeeDtoList,new EmployeeComparator());

    /*IntStream ints = new Random(209).ints(32l).;
    Stream<Integer> integerStream = ints.boxed();*/

    System.out.println(employeeDtoList);
  }
  static Comparator<EmployeeDto> sortEmployee(Comparator<EmployeeDto> employeeDtoComparator){
    return (a,b)->{
      int compare = employeeDtoComparator.compare(a, b);
    return compare;
    };
  }
}
