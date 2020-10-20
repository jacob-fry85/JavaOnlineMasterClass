public class Main {
    public static void main(String[] args) {
        Account myAccount = new Account(1111, 150000,"Darwin Tirta", "darwin@gmail.com", "(021)452025");
        Account accountDefault = new Account();

        System.out.println(myAccount);

        /*myAccount.depositFunds(500000);
        System.out.println(myAccount.getBalance());
        myAccount.withdrawalFunds(250000);
        System.out.println(myAccount.getBalance());
        myAccount.withdrawalFunds(6000000);
        System.out.println(myAccount.getBalance());*/

        System.out.println(accountDefault);

        Account jordansAccount = new Account("Jordan", "jordan@yahoo.com", "123456");
        System.out.println(jordansAccount.getAccountNumber() + " name " + jordansAccount.getCustomerName());
    }
}
