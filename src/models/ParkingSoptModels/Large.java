package models.ParkingSoptModels;

import Interface.ParkingSpot;

public class Large extends ParkingSpot {

    public Large(int id) {
        super(id);
    }

    @Override
    public boolean getIsFree() {
        return isFree;
    }
}