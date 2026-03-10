package models.VehicleModels;

import Interface.Vechile;
import models.ParkingTicket;

public class Truck extends Vechile {

    public Truck(String license){
        super(license);
    }

    @Override
    public ParkingTicket getTicket(){
        System.out.println("Truck ticket generated");
        return null;
    }
}