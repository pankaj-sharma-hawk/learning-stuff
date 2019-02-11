package geeksgeek.flipkart.set51.model;

import geeksgeek.flipkart.set51.data.DataBase;
import lombok.Data;

import java.util.List;

/**
 * Created by pankaj on 02,2019
 */

@Data
public class DriverToCustomerRating {
    private int customerId;
    private int customerRating;

    public DriverToCustomerRating(int customerId, int customerRating) {
        this.customerId = customerId;
        this.customerRating = customerRating;
        updateCustomerRating(customerId,customerRating);
    }
    private void updateCustomerRating(int customerId,int customerRating){
        DataBase base=DataBase.getDatBaseInstance();
        List<Customer> customers=base.getCustomers();
        for(Customer customer:customers){
            if(customer.getCustomerId()==customerId){
                float averageDriverRating=customer.getAverageRating();
                int numberOfDriverHired=customer.getNumberOfDriverHired();
                float totalRating=averageDriverRating*numberOfDriverHired;
                totalRating+=customerRating;
                numberOfDriverHired++;

                customer.setNumberOfDriverHired(numberOfDriverHired);
                customer.setAverageRating(totalRating/numberOfDriverHired);
                break;

            }
        }

    }
}