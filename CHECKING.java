//Zaven Ranum
//CS2050

import java.util.Random;

public class Checking extends Account {
  private double overdraftLimit;
  private double cashBack;

  public Checking(String accountName, double balance, String accountID, double overdraftLimit, double cashBack) {
    super(accountName, balance, accountID);
    this.overdraftLimit = overdraftLimit;
    this.cashBack = cashBack;
  }

  public static Checking createRandomChecking() {
    Random rand = new Random();
    String accountID = "CHK" + rand.nextInt(100000);
    return new Checking("Random Checking", rand.nextDouble() * 10000, accountID, rand.nextDouble() * 1000, rand.nextDouble() * 5);
  }

  @Override
  public String toString() {
    return super.toString() + ", Overdraft Limit: " + overdraftLimit + ", Cashback: " + cashBack;
  }
}
