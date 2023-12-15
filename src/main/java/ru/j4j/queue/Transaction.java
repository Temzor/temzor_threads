package ru.j4j.queue;

public class Transaction {
    private final int id;
    private final String purpose;
    private final int amount;


    public Transaction(int id, String purpose, int amount) {
        this.id = id;
        this.purpose = purpose;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return String.format("Transaction(id=%s ,purpose=%s ,amount=%s)",
                this.id,
                this.purpose,
                this.amount);
    }
}
