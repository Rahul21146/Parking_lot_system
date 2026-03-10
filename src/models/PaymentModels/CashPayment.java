package models.PaymentModels;

import Interface.Payment;

public class CashPayment extends Payment {

    @Override
    public boolean initicateTranascton(){

        System.out.println("Cash payment successful");

        status = Constants.PaymentStatus.COMPLETED;

        return true;
    }
}