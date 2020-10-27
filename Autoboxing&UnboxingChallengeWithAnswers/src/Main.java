public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("BCA");

        bank.addBranch("Gunung Sahari");
        bank.addCustomer("Gunung Sahari", "Jordan", 50.05);
        bank.addCustomer("Gunung Sahari", "Jackson", 175.34 );
        bank.addCustomer("Gunung Sahari", "Josh", 220.12);

        bank.addBranch("PIK");
        bank.addCustomer("PIK", "Jacob", 150.54);

        bank.addCustomerTransaction("Gunung Sahari, " , "Jordan", 44.22);
        bank.addCustomerTransaction("Gunung Sahari", "Jordan", 12.04);
        bank.addCustomerTransaction("Gunung Sahari", "Jackson", 1.65);

        bank.listCustomer("Gunung Sahari", true);
        bank.listCustomer("PIK", true);

        bank.addBranch("Melbourne");
        if(!bank.addCustomer("Melbourne", "Brian", 5.53)) {
            System.out.println("Error, Melbourne branch does not exist");
        }
    }

}
