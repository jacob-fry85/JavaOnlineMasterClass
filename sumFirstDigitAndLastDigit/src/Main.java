public class Main {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(int number) {
        if(number < 0) {
            return -1;
        }
        if(number < 10) {
            return number * 2;
        }
        int firstNumber = number % 10;
        int lastNumber = 0;
        do {
            if(number/10 == 0) {
                lastNumber = number;
            }
            number /= 10;
        } while(number > 0);
        //System.out.println(firstNumber + "  " + lastNumber);
        return firstNumber + lastNumber;
    }
}
