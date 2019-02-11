package geeksgeek.flipkart.set51.tripinterface;

import geeksgeek.flipkart.set51.model.Customer;
import geeksgeek.flipkart.set51.model.Driver;

import java.util.List;

/**
 * Created by pankaj on 02,2019
 */
public interface SortRating {
        List<Customer> getSortedCustomerBasedOnCustomer();
        List<Driver> getSortedDriverBasedOnDriver();
}
