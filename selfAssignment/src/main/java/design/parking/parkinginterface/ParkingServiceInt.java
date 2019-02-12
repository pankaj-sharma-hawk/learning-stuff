package design.parking;

import design.parking.model.ParkingSlot;

/**
 * Created by pankaj on 02,2019
 */
public interface ParkingServiceInt {
    ParkingSlot parkVehicle(String vehicleId);
    void unParkVehicle(ParkingSlot parkingSlot);
}
