package geeksgeek.flipkart.set51.model;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by pankaj on 02,2019
 */
@Data
@NoArgsConstructor
public class ScheduleTrip {
    private int tripId;
    private int customerId;
    private int driverId;

    public ScheduleTrip(int tripId, int customerId, int driverId) {
        this.tripId = tripId;
        this.customerId = customerId;
        this.driverId = driverId;
    }


}
