package models.VehicleModels;

import Interface.Vechile;
import models.ParkingTicket;

public class MoterCycleVechile extends Vechile {

    public MoterCycleVechile(String license){
        super(license);
    }

    @Override
    public ParkingTicket getTicket(){
        System.out.println("Motorcycle ticket generated");
        return null;
    }
}