//Zaven Ranum
//CS2050

import java.io.Serializable;

public abstract class Account implements Serializable {
    private String accountName;
    private String accountID;
    private double balance;
    
    public Account(String accountName, double balance, String accountID) {
        this.accountName = accountName;
        this.balance = balance;
        this.accountID = accountID;
    }

    public String getAccountName() {
        return accountName;
    }
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountID() {
        return accountID;
    }
    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
     public String toString() {
    return "Account Name: " + accountName + ", Account ID: " + accountID + ", Balance: " + balance;
    }
    
}
