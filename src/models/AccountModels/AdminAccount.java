package models.AccountModels;

import Interface.Account;
import Interface.ParkingSpot;
import models.DisplayBoard;
import models.DisplayBoard;
import models.Entrance;
import models.Exit;

public class AdminAccount extends Account {
    @Override
    public boolean restPassword() {
        // write your ow logic
        return false;
    }

    //khud ki properties add kar do
    public boolean addParkingSpot(ParkingSpot spot){
        //write your own logic
        return false;
    }

    public boolean addEntrance(Entrance entrance){
        //write your own logic
        return false;
    }

    public boolean addExit(Exit exit){
        //write your own logic
        return false;
    }

    public boolean addDiaplayBoard(DisplayBoard displayBoard){
        //write your own logic
        return false;
    }

}
