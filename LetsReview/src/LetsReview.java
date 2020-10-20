import java.util.Scanner;

public class LetsReview {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        boolean hasIntNext;
        int number = 0;
        String words1 = "";

        hasIntNext = keyboard.hasNextInt();
        if (hasIntNext) {
            number = keyboard.nextInt();
            keyboard.nextLine();
            for(int i = 0; i < number; i++) {
                words1 = keyboard.nextLine();

                for (int j = 0; j <= words1.length() - 1; j += 2) {
                    System.out.print(words1.charAt(j));
                }
                System.out.print(" ");
                for (int j = 1; j <= words1.length() - 1; j += 2) {
                    System.out.print(words1.charAt(j));
                }
                System.out.println();
            }


        }
        System.out.println();

    }
}
