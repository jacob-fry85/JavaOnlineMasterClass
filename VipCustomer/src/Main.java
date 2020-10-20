public class Main {
    public static void main(String[] args) {
        VipCustomer naruto = new VipCustomer();
        VipCustomer jordan = new VipCustomer("Jordan", 50000, "jordan@yahoo.com");
        VipCustomer kobe = new VipCustomer("kobe", "kobe@gmail.com");
        System.out.println(naruto);
        System.out.println(jordan);
        System.out.println(kobe);
    }
}
