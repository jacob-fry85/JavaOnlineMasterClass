public class Main {
    public static void main(String[] args) {
        double d1 = 20.00d;
        double d2 = 80.00d;
        double doubleTotal =  (d1 + d2) * 100;
        System.out.println("doubleTotal : " + doubleTotal);
        double modulus = doubleTotal % 40d;
        System.out.println("modulus : " + modulus);
        boolean bool = modulus == 0? true : false;
        System.out.println("bool : " + bool);
        if(bool == false) {
            System.out.println("Got some remainder");
        }
    }
}
