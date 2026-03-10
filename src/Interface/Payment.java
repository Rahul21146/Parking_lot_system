package Interface;

import Constants.PaymentStatus;
import java.util.Date;

public abstract class Payment {

    protected int amount;
    protected PaymentStatus status;
    protected Date timeStamp;
    protected String transactionId;

    public abstract boolean initicateTranascton();
}