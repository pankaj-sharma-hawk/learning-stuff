package design;

import lombok.Data;

/**
 * Created by pankaj on 02,2019
 */
@Data
public class ParkingSlot {
    private String carId;
    private String slotNo;
    private String floorNo;
    public ParkingSlot next;
}
