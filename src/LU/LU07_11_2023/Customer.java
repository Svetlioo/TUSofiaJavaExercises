package LU.LU07_11_2023;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class Customer {
    private final UUID id;
    private String name;
    List<BankAccount> bankAccounts;


    public Customer(String name) {
        this.id = UUID.randomUUID();
        ;
        this.name = name;
        this.bankAccounts = new ArrayList<>();
    }

    public List<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public void addBankAccount() {
        boolean isValid = false;
        while (!isValid) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Initial value: ");
                double initialValue = Double.parseDouble(sc.nextLine());
                this.bankAccounts.add(new BankAccount(UUID.randomUUID(), this, initialValue));
                isValid = true;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                System.out.println("Try again.");
            }
        }



    }
    public void addBankAccount(BankAccount account) {
        this.bankAccounts.add(account);
    }
}
