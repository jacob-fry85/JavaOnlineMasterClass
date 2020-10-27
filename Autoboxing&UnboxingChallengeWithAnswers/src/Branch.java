import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customersList;

    public Branch(String name){
        this.name = name;
        this.customersList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomersList() {
        return customersList;
    }

    public boolean newCustomer(String customerName, double initialAmount) {
        if(findCustomer(customerName) == null) {
            this.customersList.add(new Customer(customerName, initialAmount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransactions(String customerName, double amount) {
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName) {
        for(int i = 0; i < this.customersList.size(); i++) {
            Customer checkedCustomer = this.customersList.get(i);
            if(checkedCustomer.getName().equals(customerName)) {
                return checkedCustomer;
            }
        }
        return null;
    }
}
