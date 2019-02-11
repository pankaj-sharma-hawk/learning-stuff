package geeksgeek.flipkart.set51.data;

import geeksgeek.flipkart.set51.model.*;
import java.util.List;

/**
 * Created by pankaj on 02,2019
 */
public class DataBaseService {

    private DataBase base;

    public DataBaseService(DataBase base) {
        this.base = base;
        customers=base.getCustomers();
        drivers=base.getDrivers();
        scheduleTrips=base.getScheduleTrips();
    }

    private List<Customer> customers;
    private List<Driver> drivers;
    private List<ScheduleTrip> scheduleTrips;

    private void fillCustomerAndDriver(){
        customers.add(new Customer(0,""));
        customers.add(new Customer(1,"Pankaj"));
        customers.add(new Customer(2,"Ram"));
        customers.add(new Customer(3,"Alok"));
        customers.add(new Customer(4,"Rahul"));
        customers.add(new Customer(5,"Anujesh"));

        drivers.add(new Driver(0,""));
        drivers.add(new Driver(1,"Erza"));
        drivers.add(new Driver(2,"Natzu"));
        drivers.add(new Driver(3,"Grey"));
        drivers.add(new Driver(4,"Macorao"));
        drivers.add(new Driver(5,"Lucy"));

    }

    public void fillData(){
        fillCustomerAndDriver();
        // c2 -->>D3
        scheduleTrips.add(new ScheduleTrip(1,2,3));
        customers.get(2).getCustomerToDriverRatings().add(new CustomerToDriverRating(3,5));
        drivers.get(3).getDriverToCustomerRatings().add(new DriverToCustomerRating(2,5));

        // c1-->> D4
        scheduleTrips.add(new ScheduleTrip(2,1,4));
        customers.get(1).getCustomerToDriverRatings().add(new CustomerToDriverRating(4,4));
        drivers.get(4).getDriverToCustomerRatings().add(new DriverToCustomerRating(1,5));

        //C3-->>D5
        scheduleTrips.add(new ScheduleTrip(3,3,5));
        customers.get(3).getCustomerToDriverRatings().add(new CustomerToDriverRating(5,4));
        drivers.get(5).getDriverToCustomerRatings().add(new DriverToCustomerRating(3,4));


        //C4-->>D1
        scheduleTrips.add(new ScheduleTrip(4,4,1));
        customers.get(4).getCustomerToDriverRatings().add(new CustomerToDriverRating(1,2));
        drivers.get(1).getDriverToCustomerRatings().add(new DriverToCustomerRating(4,3));


        ///C5-->>D2
        scheduleTrips.add(new ScheduleTrip(5,5,2));
        customers.get(5).getCustomerToDriverRatings().add(new CustomerToDriverRating(2,4));
        drivers.get(2).getDriverToCustomerRatings().add(new DriverToCustomerRating(5,3));


        //C2-->D1
        scheduleTrips.add(new ScheduleTrip(6,2,1));
        customers.get(2).getCustomerToDriverRatings().add(new CustomerToDriverRating(1,5));
        drivers.get(1).getDriverToCustomerRatings().add(new DriverToCustomerRating(2,4));


        //C1-->>D3
        scheduleTrips.add(new ScheduleTrip(7,1,3));
        customers.get(1).getCustomerToDriverRatings().add(new CustomerToDriverRating(3,4));
        drivers.get(3).getDriverToCustomerRatings().add(new DriverToCustomerRating(1,5));

        //C3-->D1
        scheduleTrips.add(new ScheduleTrip(8,3,1));
        customers.get(3).getCustomerToDriverRatings().add(new CustomerToDriverRating(1,4));
        drivers.get(1).getDriverToCustomerRatings().add(new DriverToCustomerRating(3,4));


    }
}
