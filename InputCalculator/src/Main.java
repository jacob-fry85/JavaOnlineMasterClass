import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage() {
        Scanner keyboard = new Scanner(System.in);
        double count = 0;
        int number = 0;
        double total = 0;
        while(true) {
            boolean hasNextInt = keyboard.hasNextInt();
            if (hasNextInt) {
                number = keyboard.nextInt();
                total += number;
                count++;
            } else {
                break;
            }
            keyboard.nextLine();
        }
        double average = 0;
        if(count > 0) {
            average = Math.round(total/count);
        }
        System.out.println("SUM = " + (int)total + " AVG = " + (int)average);
        keyboard.close();
    }
}
