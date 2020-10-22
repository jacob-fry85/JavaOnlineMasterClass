import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    private static Customers customers;
    private static Branches branches;
    private static Bank bank;

    public static void main(String[] args) {
        customers = new Customers("Darwin");
        branches = new Branches("South Jakarta", "DKI Jakarta", customers);
        bank = new Bank("BCA", 1111, branches);
        //System.out.println(bank);

        printActions();

        LABEL:
        while (true) {
            System.out.println("Choose your action: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    break LABEL;
                case 1:
                    bank.printBranches();
                    break;
                case 2:
                    printCustomerTransOpt(chooseBranch());
                    break;
                case 3:
                    addBranch();
                    break;
                case 4:
                    addCustomer(chooseBranch());
                    break;
                case 5:
                    createTransaction(chooseCustomer(chooseBranch()));
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }

    private static void printActions() {
        System.out.println("Welcome to " + bank.getName());
        System.out.println("**************");
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0 - to shutdown\n" +
                "1 - to print branch list\n" +
                "2 - to print customers list\n" +
                "3 - to add branch\n" +
                "4 - to add customer\n" +
                "5 - to add customers transaction\n" +
                "6 - to print a list of available actions.");

    }

    private static void printCustomerTransOpt(Branches branches) {
        branches.printCustomers();
        System.out.print("Do you want to print Customers Transactions(y/n)? " );
        char choice = scanner.next().charAt(0);

        if(choice == 'y') {
            System.out.println("Heres the list again : ");
            for(int i = 0 ; i < branches.getCustomersList().size(); i++) {
                customers = branches.getCustomersList().get(i);
                System.out.println((i + 1) + ". " + customers.getName());
            }
            scanner.nextLine();
            System.out.println("Please Enter Customer name : ");
            String customerName = scanner.nextLine();
            for(int i = 0 ; i < branches.getCustomersList().size(); i++) {
                customers = branches.getCustomersList().get(i);
                if (customers.getName().equals(customerName)) {
                    branches.printCustomersTransaction(customers);
                }
            }

        }
    }
    private static void createTransaction(Customers customers) {
        System.out.println("Please choose transaction number : ");
        System.out.println("1. Add Money.");
        System.out.println("2. Withdraw Money.");
        int number = scanner.nextInt();
        scanner.nextLine();
        double money;
        if(number == 1) {
            System.out.println("How much money to Add? ");
            money = scanner.nextDouble();
            customers.addDeposit(money);
            customers.createTransaction(customers, "Deposit", money);
        } else {
            System.out.println("How much money to withdraw? ");
            money = scanner.nextDouble();
            customers.addWithdrawal(money);
            customers.createTransaction(customers, "Withdrawal", money);
        }
    }

    private static Customers chooseCustomer(Branches branches) {
        System.out.println("Available Customers : ");
        Customers customers = null;
        for(int i = 0 ; i < branches.getCustomersList().size(); i++) {
            customers = branches.getCustomersList().get(i);
            System.out.println((i + 1) + ". " + customers.getName());
        }
        System.out.println("Please Enter Customer name : ");
        String customerName = scanner.nextLine();
        for(int i = 0 ; i < branches.getCustomersList().size(); i++) {
            customers = branches.getCustomersList().get(i);
            if (customers.getName().equals(customerName)) {
                return customers;
            }
        }
        return null;
    }

    private static Branches chooseBranch() {
        System.out.println("Available branches : ");
        Branches branches = null;
        for(int i = 0 ; i < bank.getBranchesList().size(); i++) {
            branches = bank.getBranchesList().get(i);
            System.out.println((i + 1) + ". " + branches.getBranchesName());
        }
        System.out.println("Please choose and type Branches name : ");
        String branchesName = scanner.nextLine();
        for (int i = 0; i < bank.getBranchesList().size(); i++) {
            branches = bank.getBranchesList().get(i);
            if (branches.getBranchesName().equals(branchesName)) {
                return branches;
            }
        }

        return null;
    }

    private static void addCustomer(Branches branch) {
        System.out.println("Please Enter Customer name : ");
        String customerName = scanner.nextLine();
        branch.createCustomers(customerName);
    }

    private static void addBranch() {
        System.out.println("Please Enter Branch teritory : ");
        String branchName = scanner.nextLine();
        System.out.println("Please Enter Branch City : ");
        String branchCity = scanner.nextLine();
        bank.createBranches(branchName, branchCity);
    }
}
