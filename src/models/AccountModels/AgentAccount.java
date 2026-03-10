package models.AccountModels;

import Interface.Account;
import models.ParkingTicket;

public class AgentAccount extends Account {
    @Override
    public boolean restPassword() {
        //add your own logic
        return false;
    }

    // khud ki properties add karo
    public boolean processTicket(ParkingTicket ticket){
        //add your own logic
        return false;
    }
}
