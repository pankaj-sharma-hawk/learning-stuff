package geeksgeek.flipkart.set51.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pankaj on 02,2019
 */
@Data
@NoArgsConstructor
public class Customer {
    private int customerId;
    private String customerName;
    private float averageRating=0.0f;
    private int numberOfDriverHired=0;
    private List<CustomerToDriverRating> customerToDriverRatings=new ArrayList();

    public Customer(int customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
    }




}
