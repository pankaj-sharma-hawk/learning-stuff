package geeksgeek.flipkart.set51.model;

import java.util.Comparator;

/**
 * Created by pankaj on 02,2019
 */
public class CustomCustomer implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.getAverageRating()<o2.getAverageRating()?-1:(o1.getAverageRating()>o2.getAverageRating()?1:0);
    }
}
