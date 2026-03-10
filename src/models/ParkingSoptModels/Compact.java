package models.ParkingSoptModels;

import Interface.ParkingSpot;

public class Compact extends ParkingSpot {

    public Compact(int id) {
        super(id);
    }

    @Override
    public boolean getIsFree(){
        return isFree;
    }
}