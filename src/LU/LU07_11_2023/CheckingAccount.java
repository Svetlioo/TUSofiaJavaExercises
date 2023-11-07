package LU.LU07_11_2023;

import java.util.UUID;

public class CheckingAccount extends BankAccount {
    public CheckingAccount(UUID accountNumber, Customer accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    public void withdraw(double amount) {
        this.setBalance(this.getBalance() - amount);
    }
}
