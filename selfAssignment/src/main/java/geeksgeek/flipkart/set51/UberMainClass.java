package geeksgeek.flipkart.set51;

import geeksgeek.flipkart.set51.data.DataBase;
import geeksgeek.flipkart.set51.data.DataBaseService;
import geeksgeek.flipkart.set51.tripService.UberService;

/**
 * Created by pankaj on 02,2019
 */
public class UberMainClass {
    public static void main(String[] args) {
        DataBase base=DataBase.getDatBaseInstance();
        DataBaseService dataBaseService = new DataBaseService(base);
        /** Fill data **/
        dataBaseService.fillData();
        UberService uberService = new UberService();
        System.out.println(uberService.getAverageDriverRating(5));
        System.out.println(uberService.getAverageCustomerRating(1));
        uberService.addTrip(9,1,4,5,3);
        System.out.println(uberService.getSortedCustomerBasedOnCustomer());
        System.out.println(uberService.getSortedDriverBasedOnDriver());
        System.out.println(uberService.getDriverBasedOnCustomer(2));

    }
}
