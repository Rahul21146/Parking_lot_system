package models.ParkingSoptModels;

import Interface.ParkingSpot;

public class MoterCycle extends ParkingSpot {

    public MoterCycle(int id) {
        super(id);
    }

    @Override
    public boolean getIsFree(){
        return isFree;
    }
}