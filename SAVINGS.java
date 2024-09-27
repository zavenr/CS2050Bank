//Zaven Ranum
//CS2050

class SAVINGS extends ACCOUNT {
    private double interestRate;

    public SAVINGS(String accountName, double balance, String accountID, double interestRate) {
        super(accountName, balance, accountID);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

}