package Interface;

import Constants.AccountStatus;
import models.Person;

public abstract class Account {
    private int id;
    private String userName;
    private String password;
    private AccountStatus status;
    private Person person;

    public abstract boolean restPassword();
}
