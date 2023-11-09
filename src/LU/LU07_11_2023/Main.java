package LU.LU07_11_2023;

import java.util.UUID;

public class Main {
    public static void main(String[] args) throws InsufficientFundsException {
        Customer djamaikata = new Customer("djami style");
        Customer dgeto = new Customer("Dgeto");
        BankAccount bankovataSmetkaNaDjami = new BankAccount(UUID.randomUUID(), djamaikata, 500);
        djamaikata.addBankAccount(bankovataSmetkaNaDjami);
        System.out.println(djamaikata.getBankAccounts());
        bankovataSmetkaNaDjami.withdraw(200);
        bankovataSmetkaNaDjami.deposit(300);
        System.out.println("Bankova smetka");
        bankovataSmetkaNaDjami.getTransactions();
//        bankovataSmetkaNaDjami.withdraw(900);
        BankAccount spestovnaSmetkaNaDjami = new SavingsAccount(UUID.randomUUID(), djamaikata, 800);
//        spestovnaSmetkaNaDjami.withdraw(99);
        spestovnaSmetkaNaDjami.withdraw(900);
        System.out.println("Spestovna smetka:");
        spestovnaSmetkaNaDjami.deposit(300);
        spestovnaSmetkaNaDjami.deposit(600);
        spestovnaSmetkaNaDjami.getTransactions();

    }
}
