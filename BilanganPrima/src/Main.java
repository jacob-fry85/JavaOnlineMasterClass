public class Main {
    public static void main(String[] args) {
        int num = 0;
        int i = 0;
        for (i = 1; i <= 10; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                //System.out.println("i = " + i + " num = " + num + " counter = " + counter);
                if (i % num == 0) {
                    counter = counter + 1;
                    System.out.println("i % num = " + i + "%" + num + " counter = " + counter);
                }
            }
            if (counter == 2) {
                System.out.println("Bilangan Prima = "  + i);
            }
        }
    }
}


