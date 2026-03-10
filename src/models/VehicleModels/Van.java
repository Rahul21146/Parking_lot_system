package models.VehicleModels;

import Interface.Vechile;
import models.ParkingTicket;

public class Van extends Vechile {

    public Van(String license){
        super(license);
    }

    @Override
    public ParkingTicket getTicket(){
        System.out.println("Van ticket generated");
        return null;
    }
}