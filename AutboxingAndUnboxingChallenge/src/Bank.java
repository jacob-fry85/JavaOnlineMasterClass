import java.util.ArrayList;

public class Bank {
    private String name;
    private int bankId;
    private Branches branches;
    private ArrayList<Branches> branchesList;

    public Bank(String name, int bankId, Branches branches) {
        this.name = name;
        this.bankId = bankId;
        this.branches = branches;
        this.branchesList = new ArrayList<Branches>();
        branchesList.add(branches);

    }

    public String getName() {
        return name;
    }

    public int getBankId() {
        return bankId;
    }

    public Branches getBranches() {
        return branches;
    }

    public ArrayList<Branches> getBranchesList() {
        return branchesList;
    }

    public void createBranches(String branchesName, String branchesCity){
        Branches branches = new Branches(branchesName, branchesCity, new Customers());
        branchesList.add(branches);
        System.out.println(branches.getBranchesName() + " has successfully created ");
    }

    public void printBranches() {
        int i = 0;
        for(Branches branches : branchesList) {
            System.out.println((i + 1) + " Branches Name = " + branches.getBranchesName() +
                    ", Branches City = " + branches.getBranchesCity() +
                    ", Total customers = " + branches.getCustomersList().size());
            i++;
        }
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", bankId=" + bankId +
                ", branches=" + branches +
                ", branchesList=" + branchesList +
                '}';
    }
}
