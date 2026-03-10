package models.PaymentModels;

import Interface.Payment;

public class CardPayment extends Payment {

    @Override
    public boolean initicateTranascton(){

        System.out.println("Card payment successful");

        status = Constants.PaymentStatus.COMPLETED;

        return true;
    }
}