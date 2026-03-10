package models;

import Constants.TicketStatus;
import Interface.Payment;
import Interface.Vechile;

import java.util.Date;

public class ParkingTicket {

    private int ticketNo;
    private Date EntryTimeStamp;
    private Date exitTimeStamp;
    private double amount;

    public TicketStatus ticketStatus;

    private Vechile vechile;
    private Payment payment;

    private Entrance entrance;
    private Exit exit;

    public Date getEntryTimeStamp(){
        return EntryTimeStamp;
    }

    public Date getExitTimeStamp(){
        return exitTimeStamp;
    }

    public void setExitTimeStamp(Date exit){
        this.exitTimeStamp = exit;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }

    public void setTicketNo(int no){
        this.ticketNo = no;
    }

    public int getTicketNo(){
        return ticketNo;
    }

    public void setEntryTimeStamp(Date time){
        this.EntryTimeStamp = time;
    }

    public void setVechile(Vechile v){
        this.vechile = v;
    }

}