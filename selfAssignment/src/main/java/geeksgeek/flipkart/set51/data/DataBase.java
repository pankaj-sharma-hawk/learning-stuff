package geeksgeek.flipkart.set51.data;

import geeksgeek.flipkart.set51.model.Customer;
import geeksgeek.flipkart.set51.model.Driver;
import geeksgeek.flipkart.set51.model.ScheduleTrip;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pankaj on 02,2019
 */

public class DataBase {
    private  List<Customer> customers = new ArrayList();
    private  List<Driver> drivers = new ArrayList();
    private  List<ScheduleTrip> scheduleTrips = new ArrayList();

    private static DataBase base=null;

    private DataBase() {
    }

    public static DataBase getDatBaseInstance(){
        if(base==null){
            base=new DataBase();
        }
        return base;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public List<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(List<Driver> drivers) {
        this.drivers = drivers;
    }

    public List<ScheduleTrip> getScheduleTrips() {
        return scheduleTrips;
    }

    public void setScheduleTrips(List<ScheduleTrip> scheduleTrips) {
        this.scheduleTrips = scheduleTrips;
    }
}
