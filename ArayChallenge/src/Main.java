import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("How many array? ");
        int arrayNumber = scanner.nextInt();

        int[] array = getIntegers(arrayNumber);
        printArray(sortIntegers(array));
    }

    public static int[] getIntegers(int number) {
        int[] value = new int[number];
        System.out.print("Please input array : ");
        for (int i = 0; i < value.length; i++) {
            value[i] = scanner.nextInt();
        }
        return value;
    }

    public static int[] sortIntegers(int[] array) {
        int temp=0;
        for (int i = 0; i < array.length; i++) {
            for(int j = i + 1 ; j<= array.length - 1;j++) {
                if(array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static void printArray(int[] array) {
        System.out.print("Your array : ");
        for (int i : array)
            System.out.print(i + " ");
    }
}
