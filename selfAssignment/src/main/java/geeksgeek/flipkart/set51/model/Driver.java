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
public class Driver {
    private int driverId;
    private String driverName;
    private float averageRating=0.0f;
    private int numberOfCustomerRatingGiven=0;
    private List<DriverToCustomerRating> driverToCustomerRatings=new ArrayList();

    public Driver(int driverId, String driverName) {
        this.driverId = driverId;
        this.driverName = driverName;
    }

}
