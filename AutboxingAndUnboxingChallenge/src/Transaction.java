public class Transaction {
    private String transactionName;
    private double transactionAmount;

    public Transaction() {
        this("Deposit", 1000);
    }

    public Transaction(String transactionName, double transactionAmount) {
        this.transactionName = transactionName;
        this.transactionAmount = transactionAmount;
    }

    public String getTransactionName() {
        return transactionName;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionName='" + transactionName + '\'' +
                ", transactionAmount=" + transactionAmount +
                '}';
    }
}
