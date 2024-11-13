//Zaven Ranum
//CS2050

import java.util.Random;

public class Savings extends Account {
  private double interestRate;

  public Savings(String accountName, double balance, String accountID, double interestRate) {
    super(accountName, balance, accountID);
    this.interestRate = interestRate;
  }

  public static Savings createRandomSavings() {
    Random rand = new Random();
    String accountID = "SAV" + rand.nextInt(100000);
    return new Savings("Random Savings", rand.nextDouble() * 10000, accountID, rand.nextDouble() * 5);
  }

  @Override
  public String toString() {
    return super.toString() + ", Interest Rate: " + interestRate;
  }
}
