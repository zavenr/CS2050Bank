//Zaven Ranum
//CS2050

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Program7 {
    public static void main(String[] args) {
        AccountStack<Account> accountStack = new AccountStack<>();
        Queue<Customer> customerQueue = new LinkedList<>();

        for (int i = 0; i < 25; i++) {
            if (i % 2 == 0) {
                accountStack.push(Checking.createRandomChecking());
            } else {
                accountStack.push(Savings.createRandomSavings());
            }
        }

        for (int i = 0; i < 10; i++) {
            Customer customer = new Customer("Customer" + i, i, null);
            customerQueue.add(customer);
        }

        Random rand = new Random();
        for (int i = 0; i < 30; i++) {
            Customer customer = customerQueue.poll();
            if (customer != null) {
                if (customer.getAccount() == null && !accountStack.isEmpty()) {
                    customer.setAccount(accountStack.pop());
                }
                double transactionAmount = rand.nextDouble() * 200 - 100;
                if (customer.getAccount() != null) {
                    customer.getAccount().setBalance(customer.getAccount().getBalance() + transactionAmount);
                }
                customerQueue.add(customer);
            }
        }

        try (FileWriter fw = new FileWriter("ProgramOutput.txt");
             PrintWriter pw = new PrintWriter(fw)) {
            pw.println("Customer Details After Simulation:");
            for (Customer customer : customerQueue) {
                pw.println("Customer ID: " + customer.getCustomerID() +
                           ", Name: " + customer.getName());
                if (customer.getAccount() != null) {
                    pw.println("Account Type: " + customer.getAccount().getAccountName() +
                               ", Balance: " + customer.getAccount().getBalance() +
                               ", Account ID: " + customer.getAccount().getAccountID());
                } else {
                    pw.println("No account assigned.");
                }
                pw.println("-----------------------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
