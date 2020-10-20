import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean hasNextInt;
        int counter = 1;
        int number = 0;
        int total = 0;
        while (true) {
            System.out.print("Enter number(3 number), number #" + counter + ": ");
            hasNextInt = keyboard.hasNextInt();
            if (hasNextInt) {
                number = keyboard.nextInt();
                total += number;
                if (counter == 3) {
                    break;
                }
                counter++;
            } else {
                System.out.println("Please input a valid number");
            }

            keyboard.nextLine();
        }
        System.out.println("The total is : " + total);
        keyboard.close();
    }
}
