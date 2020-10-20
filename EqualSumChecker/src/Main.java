public class Main {
    public static boolean hasEqualSum(int num1, int num2, int num3) {
        boolean status = false;

        int total = num1 + num2;
        if(total == num3) {
            status = true;
        }
        System.out.println(status);
        return  status;
    }
    public static void main(String[] args) {
        hasEqualSum(1, 1, 1);
        hasEqualSum(1, 1, 2);
        hasEqualSum(1, -1, 0);
    }
}
