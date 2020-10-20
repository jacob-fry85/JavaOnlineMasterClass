public class DigitSum {
    public static void main(String[] args) {
        System.out.println(sumDigits(5858));
        System.out.println(sumDigits(-125));
        System.out.println(sumDigits(4));
        System.out.println(sumDigits(32123));
    }

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }
        int digits = 0;
        int sum = 0;
        do {
            digits = number % 10;
            sum += digits;
            number /= 10;
        } while (number > 0);

        return sum;

    }
}
