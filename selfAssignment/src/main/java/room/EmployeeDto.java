package room;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by pankaj on 05,2019
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {

  private String name;
  private int salary;

}
