import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int yearOfBirth = 0;
        boolean hasNextInt;
        do {
            do {
                System.out.println("Enter your year of birth:");
                hasNextInt = keyboard.hasNextInt();
                if(hasNextInt) {
                    yearOfBirth = keyboard.nextInt();
                    keyboard.nextLine();

                    if (isYearValid(yearOfBirth) == false) {
                        System.out.println("Year must be greater than zero and less than 2020!");
                    }
                } else {
                    System.out.println("Unable to parse year of birth.");
                }
            } while(isYearValid(yearOfBirth) == false);

            System.out.println("Enter your name : ");
            String name = keyboard.nextLine();

            System.out.println("Your name is " + name + " and your age is " + countYear(yearOfBirth));
        } while(yearOfBirth != 0);


        keyboard.close();
    }
    public static boolean isYearValid(int yearOfBirth) {
        if(yearOfBirth < 0 || yearOfBirth > 2020) {
            return false;
        }

        int age = 2020 - yearOfBirth;
        //System.out.println(age);
        if(age < 0 || age > 100) {
            //System.out.println("wrong");
            return false;
        }

        return true;
    }

    public static int countYear(int yearOfBirth) {
        return 2020 - yearOfBirth;
    }
}
