import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many arrays ? ");
        int numbers = scanner.nextInt();
        int[] array = getIntegers(numbers);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(reverse(array)));
    }

    public static int[] getIntegers(int number) {
        int[] array = new int[number];
        System.out.println("please input " + number + " arrays : ");
        for(int i = 0; i < number ; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int[] reverse(int[] array) {
        int[] newArray = new int[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            newArray[j] = array[i];
            j++;
        }
        return newArray;
    }
}
