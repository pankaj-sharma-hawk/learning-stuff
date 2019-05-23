package room;

import java.util.Comparator;

/**
 * Created by pankaj on 05,2019
 */
public class EmployeeComparator implements Comparator<EmployeeDto> {

  @Override
  public int compare(EmployeeDto o1, EmployeeDto o2) {

    /*if(o2.getSalary()<o1.getSalary())
      return 1;
    else if(o2.getSalary()>o1.getSalary())
      return 1;
    else
      return -1;*/
    System.out.println("[a ]"+o1.getSalary()+"  [b ]"+o2.getSalary()+" [diff ]"+(o1.getSalary()-o2.getSalary()));
    return o1.getSalary()-o2.getSalary();
  }
}
