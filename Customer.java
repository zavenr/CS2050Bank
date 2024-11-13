//Zaven Ranum
//CS2050

import java.io.Serializable;

public class Customer implements Serializable {
    private String name;
    private int customerID;
    private Account account;

    public Customer(String name, int customerID, Account account) {
        this.name = name;
        this.customerID = customerID;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public int getCustomerID() {
        return customerID;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Customer ID: " + customerID + ", Name: " + name + ", Account: " + account;
    }
}
