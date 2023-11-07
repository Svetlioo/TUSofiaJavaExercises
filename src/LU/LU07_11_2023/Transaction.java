package LU.LU07_11_2023;

import java.rmi.server.UID;
import java.util.Date;
import java.util.UUID;

public class Transaction {
    private UUID transactionID;
    private Date date;
    private Type type;
    private double amount;

    public Transaction(UUID transactionID, Date date, Type type, double amount) {
        this.transactionID = transactionID;
        this.date = date;
        this.type = type;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction" +
                "transactionID=" + transactionID +
                ", date=" + date +
                ", type=" + type +
                ", amount=" + amount;
    }
}
