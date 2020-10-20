import java.util.Scanner;

public class Solution {

    // Complete the staircase function below.
    static void staircase(int n) {
        int j, l, m = n;
        for(int i = n; i > 0; i--) {
            j = i - 1;
            while (j > 0) {
                System.out.print(" ");
                j--;
            }
            l = m - --n;
            for(int k = 0; k < l; k++ )
                System.out.print("#");
            System.out.println();
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
