import java.util.ArrayList;
import java.util.List;

public class MobilePhone {
    private Contacts contacts;
    private List<Contacts> contactsList = new ArrayList<>();

    public void addContactList(Contacts contacts) {
        contactsList.add(contacts);
    }

    public List<Contacts> getContactsList() {
        return contactsList;
    }

    public Contacts getContacts() {
        return contacts;
    }

    public void modifyContact(String currentName, long newNumber) {
        Contacts contactsFound = findContact(currentName);
        if (contactsFound != null) {
            modifyContact(contactsFound, newNumber);
        } else {
            System.out.println("Name not found...");
        }
    }

    private void modifyContact(Contacts contactsFound, long newNumber) {
        contactsFound.setPhoneNumber(newNumber);
        System.out.println("Contacts name *** " + contactsFound.getName() + " *** has been modified");

    }

    public void removeContact(String currentName) {
        Contacts contactsFound = findContact(currentName);
        if (contactsFound != null) {
            removeContact(contactsFound);
            System.out.println(currentName + " data has been removed");
        } else {
            System.out.println("Name not found...");
        }
    }

    private void removeContact(Contacts contactsFound) {
        contactsList.remove(contactsFound);
        System.out.println("Contacts name *** " + contactsFound.getName() + " *** has been deleted");
    }

    public void searchContact(String currentName) {
        Contacts contactsFound = findContact(currentName);
        if (contactsFound != null) {
            System.out.println("Name = " + contactsFound.getName() + " Phone number = " + contactsFound.getPhoneNumber() + " found!");
            System.out.println("Index of contacts = " + findContact(contactsFound));
        } else {
            System.out.println("Name not found...");
        }
    }
    public int findContact(Contacts contacts) {
        return this.contactsList.indexOf(contacts);
    }

    private Contacts findContact(String searchName) {
        Contacts searchContact = null;
        for (Contacts c : contactsList) {
            if (c.getName().equals(searchName)) {
                //System.out.println(searchName + " found = " + c.getName());
                searchContact = c;
            }
        }
        return searchContact;
    }

    public void printContacts() {
        for(Contacts  contacts : contactsList) {
            System.out.println(contacts.getName() + " " + contacts.getPhoneNumber());
        }
        System.out.println("You have " + contactsList.size() + " contact list");
    }
}
