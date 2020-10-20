

public class Main {
    public static void main(String[] args) {
        /*getLargestPrime(21);
        getLargestPrime(217);
        getLargestPrime(0);
        getLargestPrime(45);
        getLargestPrime(-1);*/
        //getLargestPrime(7);
        //getLargestPrime(21);
        //getLargestPrime(31);
        //getLargestPrime(31);
        //getLargestPrime(2);
        //getLargestPrime(45);

        //getLargestPrime(29);
        System.out.println(isPrime(16));
    }

    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }
        int largestPrime = 0;
        int num = 0;
        int i = 0;
        for (i = 1; i <= number; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                //System.out.println("i = " + i);
                if (number % i == 0) {
                    //System.out.println("i = " + i);
                    largestPrime = i;
                }
            }
        }
        System.out.println("largest prime = " + largestPrime);
        return largestPrime;
    }

    public static boolean isPrime(int number) {
        if (number < 0) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            //System.out.println("number = " + number + "i = " + i);
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
