package geeksgeek.flipkart.set51.tripService;

import geeksgeek.flipkart.set51.data.DataBase;
import geeksgeek.flipkart.set51.model.*;
import geeksgeek.flipkart.set51.tripinterface.Rating;
import geeksgeek.flipkart.set51.tripinterface.SortRating;
import geeksgeek.flipkart.set51.tripinterface.uberTrip;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by pankaj on 02,2019
 */
public class UberService implements Rating,uberTrip,SortRating {
    private DataBase base=DataBase.getDatBaseInstance();

    @Override
    public float getAverageCustomerRating(int customerId) {
        for(Customer customer:base.getCustomers()){
            if(customer.getCustomerId()==customerId){
                return customer.getAverageRating();
            }
        }
        return Float.MIN_VALUE;
    }

    @Override
    public float getAverageDriverRating(int driverId) {
        for(Driver driver:base.getDrivers()){
            if(driver.getDriverId()==driverId){
                return driver.getAverageRating();
            }
        }
        return Float.MIN_VALUE;
    }

    @Override
    public void addTrip(int tripId,int customerId,int customerRating, int driverId,int driverRating) {
        base.getScheduleTrips().add(new ScheduleTrip(tripId,customerId,driverId));
        base.getCustomers().get(customerId).getCustomerToDriverRatings().add(new CustomerToDriverRating(driverId,driverRating));
        base.getDrivers().get(driverId).getDriverToCustomerRatings().add(new DriverToCustomerRating(customerId,customerRating));

    }

    private Customer getFilterCustomer(int customerId){
        List<Customer> customers=base.getCustomers();
        for(Customer customer:customers){
            if(customer.getCustomerId()==customerId){
                return customer;
            }
        }
        return null;
    }

    private boolean checkCustomerGivenOnePointToDriver(List<CustomerToDriverRating> ratings,int driverId){
        for(CustomerToDriverRating customerToDriverRating:ratings ){
            if(customerToDriverRating.getDriverId()==driverId && customerToDriverRating.getDriverRating()==1){
                return true;
            }
        }
        return false;
    }

    private List<Driver> getFilterDriver(Customer filterCustomer){
        List<Driver> drivers=base.getDrivers();
        List<Driver> filterDrivers=null;
        for (Driver driver:drivers){
            if(driver.getAverageRating()>=filterCustomer.getAverageRating()){
                if(!checkCustomerGivenOnePointToDriver(filterCustomer.getCustomerToDriverRatings(),driver.getDriverId())) {
                    if(filterDrivers==null){
                        filterDrivers=new ArrayList<>();
                    }
                    filterDrivers.add(driver);
                }
                break;
            }
        }
        return filterDrivers;

    }

    private Driver getDriverBasedOnID(int driverId){
        List<Driver> drivers=base.getDrivers();
        for(Driver driver:drivers){
            if(driver.getDriverId()==driverId){
                return driver;
            }
        }
        return null;
    }


    @Override
    public List<Driver> getDriverBasedOnCustomer(int customerId) {

        List<Driver> resultDriver=null;
        Customer filterCustomer=getFilterCustomer(customerId);
        /** Filter Driver Whoes rating are more than customer
         * and Customer not giving one rating*/
        List<Driver> filterDrivers=getFilterDriver(filterCustomer);
        if(filterDrivers==null){
            CustomerToDriverRating result = filterCustomer
                    .getCustomerToDriverRatings()
                    .get(filterCustomer.getCustomerToDriverRatings().size() - 1);
            Driver driver = getDriverBasedOnID(result.getDriverId());
            if(resultDriver==null){
                resultDriver=new ArrayList<>();
                resultDriver.add(driver);
            }
        }else{
            resultDriver=new ArrayList<>(filterDrivers);
        }

        return resultDriver;


    }

    @Override
    public List<Customer> getSortedCustomerBasedOnCustomer() {
        List<Customer> customers=new ArrayList<>(base.getCustomers());
        Collections.sort(customers, new CustomCustomer());
        return customers;
    }

    @Override
    public List<Driver> getSortedDriverBasedOnDriver() {
        List<Driver> drivers=new ArrayList<>(base.getDrivers());
        Collections.sort(drivers, new CustomDriver());
        return drivers;
    }
}
