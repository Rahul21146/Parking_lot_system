package models;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Exit {

    private int id;

    public Exit(int id){
        this.id = id;
    }

    public void validateTicket(ParkingTicket ticket){

        ticket.setExitTimeStamp(new Date());

        long diff = ticket.getExitTimeStamp().getTime() - ticket.getEntryTimeStamp().getTime();

        long hours = TimeUnit.MILLISECONDS.toHours(diff);

        if(hours == 0){
            hours = 1;
        }

        ParkingRate rate = new ParkingRate(hours);

        double amount = rate.calculateAmount();

        ticket.setAmount(amount);

        System.out.println("Parking fee: ₹" + amount);

    }
}