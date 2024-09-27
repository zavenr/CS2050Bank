//Zaven Ranum
//CS2050

class CHECKING extends ACCOUNT {
    private double overdraftLimit;
    private double cashBack;

    public CHECKING(String accountName, double balance, String accountID, double overdraftLimit, double cashBack) {
        super(accountName, balance, accountID);
        this.overdraftLimit = overdraftLimit;
        this.cashBack = cashBack;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }
    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public double getCashBack() {
        return cashBack;
    }
    public void setCashBack(double cashBack) {
        this.cashBack = cashBack;
    }


}
