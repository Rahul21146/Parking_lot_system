package models.ParkingSoptModels;

import Interface.ParkingSpot;

public class HandiCapped extends ParkingSpot {

    public HandiCapped(int id) {
        super(id);
    }

    @Override
    public boolean getIsFree() {
        return isFree;
    }
}