import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("How many numbers to input ? ");
        int numbers = keyboard.nextInt();
        int[] array = readIntegers(numbers);
        int min = findMin(array);

        System.out.println(Arrays.toString(array));
        System.out.println("min number = " + min);
    }

    public static int[] readIntegers(int count) {
        System.out.print("Please input the numbers : ");
        int[] array = new int[count];
        for(int i = 0; i < count; i++) {
            array[i] = keyboard.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array) {
        int min = 0;
        boolean flag = false;
        min = array[0];
        for(int i = 1; i < array.length;i++) {
            if(min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
