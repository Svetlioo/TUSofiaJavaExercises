package LU.LU07_11_2023;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.UUID;

public class BankAccount {
    private UUID accountNumber;
    private Customer accountHolder;
    private double balance;
    private final ArrayList<Transaction> transactions;

    public BankAccount(UUID accountNumber, Customer accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.transactions = new ArrayList<>();
        this.accountHolder.addBankAccount(this);
    }

    public void setAccountHolder(Customer accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
        this.transactions.add(new Transaction(UUID.randomUUID(), new Date(), Type.DEPOSIT, amount));
    }

    public double getBalance() {
        return balance;
    }

    public void getTransactions() {
        Scanner sc = new Scanner(System.in);
        for (Transaction t:
             this.transactions) {
            System.out.println(t.toString());
        }

    }

    public void withdraw(double amount) throws InsufficientFundsException {
        try {
            if (hasEnoughBalance(amount)) {
                this.balance -= amount;
                this.transactions.add(new Transaction(UUID.randomUUID(), new Date(), Type.WITHDRAWAL, amount));
                System.out.printf("Successfully withdrew %.2f.%n", amount);
                System.out.printf("Current balance: %.2f.%n", this.balance);
            } else {
                System.out.printf("Current balance: %.2f.%n", this.balance);
                throw new InsufficientFundsException("Not enough money in bank account!");
            }
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

    }

    public boolean hasEnoughBalance(double amount) {
        return this.balance >= amount;
    }

    @Override
    public String toString() {
        return "BankAccount" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountHolder=" + accountHolder +
                ", balance=" + balance;
    }
}
