package Interface;

import models.ParkingTicket;

public abstract class Vechile {

    protected String licenseNo;

    public Vechile(String licenseNo){
        this.licenseNo = licenseNo;
    }

    public String getLicenseNo(){
        return licenseNo;
    }

    public abstract ParkingTicket getTicket();
}