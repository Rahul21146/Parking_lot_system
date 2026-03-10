package models.VehicleModels;

import Interface.Vechile;
import models.ParkingTicket;

public class Car extends Vechile {

    public Car(String license){
        super(license);
    }

    @Override
    public ParkingTicket getTicket(){
        System.out.println("Car ticket generated");
        return null;
    }
}