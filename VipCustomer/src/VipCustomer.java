public class VipCustomer {
    private String vipCustomerName;
    private int creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("Default Name", 2000, "Default Email Address");
    }

    public VipCustomer(String vipCustomerName, String emailAddress) {
        this.creditLimit = 2000;
        this.vipCustomerName = vipCustomerName;
        this.emailAddress = emailAddress;
    }

    public VipCustomer(String vipCustomerName, int creditLimit, String emailAddress) {
        this.vipCustomerName = vipCustomerName;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getVipCustomerName() {
        return vipCustomerName;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String toString() {
        return "VipCustomer{" +
                "vipCustomerName='" + vipCustomerName + '\'' +
                ", creditLimit=" + creditLimit +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
