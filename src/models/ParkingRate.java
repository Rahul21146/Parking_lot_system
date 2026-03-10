package models;

public class ParkingRate {

    private double hours;
    private double rate = 20;

    public ParkingRate(double hours){
        this.hours = hours;
    }

    public double calculateAmount(){

        double amount = hours * rate;

        return amount;
    }
}