import java.util.ArrayList;

public class Branches {
    private String branchesName;
    private String branchesCity;
    private Customers customers;
    private ArrayList<Customers> customersList = new ArrayList<>();

    public Branches(String branchesName, String branchesCity, Customers customers) {
        this.branchesName = branchesName;
        this.branchesCity = branchesCity;
        this.customers = customers;
        customersList.add(customers);
    }

    public String getBranchesName() {
        return branchesName;
    }

    public String getBranchesCity() {
        return branchesCity;
    }

    public Customers getCustomers() {
        return customers;
    }

    public ArrayList<Customers> getCustomersList() {
        return customersList;
    }

    public void createCustomers(String customerName) {
        Customers customers = new Customers(customerName);
        customersList.add(customers);
        System.out.println(customerName + " Successfully created!");
    }

    public void printCustomers() {
        int i = 0;
        for(Customers customers : customersList) {
            System.out.println((i+1) + ". Customer Name  = " + customers.getName() + ", Customer Bank Amount = $" + customers.getAccountAmount());
            i++;
        }
    }

    public void printCustomersTransaction(Customers customers) {
        int i = 0;
        for(Transaction transaction : customers.getTransactionList()) {
            System.out.println((i+1) + ". Transaction Name  = " + transaction.getTransactionName() + ", Transaction type = $" + transaction.getTransactionAmount());
            i++;
        }
    }

    @Override
    public String toString() {
        return "Branches{" +
                "branchesName='" + branchesName + '\'' +
                ", branchesCity='" + branchesCity + '\'' +
                ", customers=" + customers +
                ", customersList=" + customersList +
                '}';
    }
}
