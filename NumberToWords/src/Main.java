public class Main {
    public static void main(String[] args) {
        /*numberToWords(1212);
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);*/

       /* getDigitCount(1212);
        getDigitCount(123);
        getDigitCount(1010);
        getDigitCount(1000);*/

        //reverse(-2521);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int digits = 0;
        int counted = getDigitCount(number);
        int countingZero = 0;
        number = reverse(number);
        do {
            digits = number % 10;
            switch (digits) {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
            }
            number /= 10;
            countingZero++;
        } while (number > 0);
        counted -= countingZero;
        for(int i = 0; i < counted; i++)
            System.out.print("Zero ");
        System.out.println();
    }

    public static int reverse(int number) {
        boolean minus = false;
        if(number <=0) {
            minus = true;
        }
        number = Math.abs(number);
        String result = "";
        int awal = number;
        int digits = 0;
        if(minus) {
            result += "-";
        }
        do {
            digits = number % 10;
            result += digits;
            number /= 10;
        } while (number > 0);
        digits = Integer.parseInt(result);
        System.out.println("First number and Reversed : " + awal + " and " + digits);
        return digits;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int count = 0;
        do {
            number /= 10;
            count++;
        } while (number > 0);
        //System.out.println("count = " +  count);
        return count;
    }
}
