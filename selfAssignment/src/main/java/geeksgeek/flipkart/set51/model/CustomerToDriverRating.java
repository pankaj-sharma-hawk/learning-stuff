package geeksgeek.flipkart.set51.model;

import geeksgeek.flipkart.set51.data.DataBase;
import lombok.Data;

import java.util.List;

/**
 * Created by pankaj on 02,2019
 */
@Data
public class CustomerToDriverRating {
    private int driverId;
    private int driverRating;

    public CustomerToDriverRating(int driverId, int driverRating) {
        this.driverId = driverId;
        this.driverRating = driverRating;
        updateDriverRating(driverId,driverRating);
    }

    private void updateDriverRating(int driverId,int driverRating){
        DataBase base=DataBase.getDatBaseInstance();
        List<Driver> drivers=base.getDrivers();
        for(Driver driver:drivers){
            if(driver.getDriverId()==driverId){
                float averageDriverRating=driver.getAverageRating();
                int numberOfCustomerRatingGiven=driver.getNumberOfCustomerRatingGiven();
                float totalRating=averageDriverRating*numberOfCustomerRatingGiven;
                totalRating+=driverRating;
                numberOfCustomerRatingGiven++;

                driver.setNumberOfCustomerRatingGiven(numberOfCustomerRatingGiven);
                driver.setAverageRating(totalRating/numberOfCustomerRatingGiven);
                break;

            }
        }

    }

}

