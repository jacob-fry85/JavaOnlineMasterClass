public class Account {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Account() {
        this(2222, 5000000, "Default name", "Default email", "Default phone");
    }
    public Account(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Account(String customerName, String email, String phoneNumber) {
        this(9999,100.55, customerName, email, phoneNumber);
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public void depositFunds(double totalDeposit) {
        this.balance += totalDeposit;
        System.out.println("Deposit of " + totalDeposit + " success. Total balance is " + balance);
    }

    public void withdrawalFunds(double totalWithdrawal) {
        if(balance < totalWithdrawal) {
            System.out.println("Only balance " + balance + " available. Withdrawal not processed");
        } else {
            this.balance -= totalWithdrawal;
            System.out.println("Withdrawal of " + totalWithdrawal + " processed. Remaining balance = " + balance);
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                ", customerName='" + customerName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
