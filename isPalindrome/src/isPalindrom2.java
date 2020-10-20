

public class isPalindrom2 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(11212));
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(12321));
    }

    public static boolean isPalindrome(int number) {
        int digit = 0;
        String reverse = "";
        number = Math.abs(number);
        String compare = Integer.toString(number);
        do {
            digit = number % 10;
            reverse += digit;
            number /= 10;
        } while (number > 0);

        System.out.println("numbers and reverse : " + compare + " " + reverse);
        return reverse.equals(compare);
    }
}
