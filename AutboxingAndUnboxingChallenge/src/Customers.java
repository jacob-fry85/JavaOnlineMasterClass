import java.util.ArrayList;

public class Customers {
    private String name;
    private double accountAmount;
    private Transaction transaction;
    private ArrayList<Transaction> transactionList = new ArrayList<>();

    public Customers() {

    }

    public Customers(String name) {
        this.name = name;
        this.transaction = new Transaction();
        this.transactionList = new ArrayList<>();
        this.accountAmount = 1000;
        transactionList.add(transaction);
    }

    public double getAccountAmount() {
        return accountAmount;
    }

    public String getName() {
        return name;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public ArrayList<Transaction> getTransactionList() {
        return transactionList;
    }

    public Customers createCustomers(String name) {
        return new Customers(name);
    }

    public void addDeposit(double depositAmount) {
        if(depositAmount <= 0) {
            accountAmount += 0;
        } else {
            accountAmount += depositAmount;
            System.out.println("Deposit = " + depositAmount + " success. Your AccountAmount = " + accountAmount);
        }
    }

    public void addWithdrawal(double withdrawalAmount) {
        if(accountAmount < withdrawalAmount) {
            System.out.println("Account amount = " + accountAmount + " not sufficient");
        } else {
            accountAmount -= withdrawalAmount;
            System.out.println("Withdrawal = " + withdrawalAmount + " success. Your AccountAmount = " + accountAmount);
        }
    }

    public void createTransaction (Customers customers, String transactionName, double transactionAmount) {
        transaction = new Transaction(transactionName, transactionAmount);
        customers.transactionList.add(transaction);
    }
    @Override
    public String toString() {
        return "Customers{" +
                "name='" + name + '\'' +
                ", accountAmount=" + accountAmount +
                ", transaction=" + transaction +
                ", transactionList=" + transactionList +
                '}';
    }
}
