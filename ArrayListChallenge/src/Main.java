import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static Contacts contacts;
    public static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {
        printInstructions();

        LABEL: while(true) {
            System.out.println("Enter your choice : ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    printContactList();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    modifyContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    break LABEL;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To press choice options. ");
        System.out.println("\t 1 - To print the list of Contacts Number.");
        System.out.println("\t 2 - To add contact to the list");
        System.out.println("\t 3 - To modify contact in the list");
        System.out.println("\t 4 - To remove contact from the list");
        System.out.println("\t 5 - To search contact in the list");
        System.out.println("\t 6 - To quit the application");
    }

    public static void printContactList() {
       mobilePhone.printContacts();
    }

    public static void addContact() {
        System.out.print("Please Enter Contacts name : " );
        String name = scanner.next();
        long phoneNumber = scanner.nextLong();
        contacts = new Contacts(name,phoneNumber);
        mobilePhone.addContactList(contacts);
    }

    public static void modifyContact() {
        System.out.print("Please Enter Contacts name you want to modify : " );
        String currentName = scanner.next();
        System.out.print("Enter new Phone number : ");
        long newNumber = scanner.nextLong();
        mobilePhone.modifyContact(currentName, newNumber);
    }
    public static void removeContact() {
        System.out.print("Please Enter Contacts name you want to remove : " );
        String currentName = scanner.next();
        mobilePhone.removeContact(currentName);
    }

    public static void searchContact() {
        System.out.print("Please Enter Contacts name you want to search : " );
        String currentName = scanner.next();
        mobilePhone.searchContact(currentName);
    }
}
