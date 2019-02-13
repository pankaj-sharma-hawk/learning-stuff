package design.parking.parkinginterface;

import design.ParkingSlot;

/**
 * Created by pankaj on 02,2019
 */
public interface ParkingServiceInt {
    ParkingSlot parkVehicle(String vehicleId);
    void unParkVehicle(ParkingSlot parkingSlot);
}
