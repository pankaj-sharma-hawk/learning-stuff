package geeksgeek.flipkart.set51.tripinterface;

import geeksgeek.flipkart.set51.model.Driver;

import java.util.List;

/**
 * Created by pankaj on 02,2019
 */
public interface uberTrip {
    void addTrip(int tripId,int customerId,int customerRating, int driverId,int driverRating);
    List<Driver> getDriverBasedOnCustomer(int customerId);
}
