package models;

import Interface.Vechile;

import java.util.Date;

public class Entrance {

    private int id;

    public Entrance(int id){
        this.id = id;
    }

    public ParkingTicket getTicket(Vechile vechile){

        ParkingTicket ticket = new ParkingTicket();

        ticket.setTicketNo((int)(Math.random()*10000));
        ticket.setEntryTimeStamp(new Date());
        ticket.setVechile(vechile);

        System.out.println("Ticket Generated: " + ticket.getTicketNo());

        return ticket;
    }
}