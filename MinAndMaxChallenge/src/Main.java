import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean hasNextInt;
        int number = 0;
        int minNumber = 0;
        int maxNumber = 0;
        boolean first = true;
        while(true) {
            System.out.print("Enter number = ");
            hasNextInt = keyboard.hasNextInt();
            if(hasNextInt) {
                number = keyboard.nextInt();
                if (first) {
                    maxNumber = number;
                    minNumber = number;
                    first = false;
                }
                if(first == false && maxNumber < number) {
                    maxNumber = number;
                    //System.out.println("in max" + maxNumber);
                }
                if (first == false && minNumber > number) {
                    minNumber = number;
                    //System.out.println("in min" + minNumber);
                }
            } else {
                System.out.println("Invalid Number");
                break;
            }
            keyboard.nextLine();
        }

        System.out.println("Min = " + minNumber + " Max = " + maxNumber);
    }
}
