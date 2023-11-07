package LU.LU07_11_2023;

import java.util.UUID;

public class SavingsAccount extends BankAccount {
    public SavingsAccount(UUID accountNumber, Customer accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount < 100) throw new InsufficientFundsException("Not allowed to withdraw less than 100$!");
        super.withdraw(amount);

    }
}
