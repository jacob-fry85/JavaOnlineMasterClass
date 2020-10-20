import java.util.Scanner;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int countMinus = 0;
        int countZero = 0;
        int countPlus = 0;

        for(int i = 0; i< arr.length; i++) {
            if(arr[i] < 0)
                countMinus++;
            if(arr[i] == 0)
                countZero++;
            if(arr[i] > 0)
                countPlus++;
        }
        double totalMinus = (double)countMinus/arr.length;
        double totalZero = (double)countZero/arr.length;
        double totalPlus = (double)countPlus/arr.length;

        String result = String.format("%.6f", totalPlus);
        System.out.println(result);
        result = String.format("%.6f", totalMinus);
        System.out.println(result);
        result = String.format("%.6f", totalZero);
        System.out.println(result);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
