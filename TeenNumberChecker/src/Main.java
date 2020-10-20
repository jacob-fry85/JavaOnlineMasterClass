public class Main {
    public static boolean hasTeen(int num1, int num2, int num3) {
        boolean status = false;

        if((num1 >= 13 && num1 <= 19) || (num2 >= 13 && num2 <= 19) || (num3 >= 13 && num3 <= 19)) {
            status = true;
        }

        return status;
    }

    public static boolean isTeen(int num1) {
        boolean status = false;

        if(num1 >= 13 && num1 <= 19) {
            status = true;
        }

        return  status;
    }
    public static void main(String[] args) {
        hasTeen(9, 99, 19);
        hasTeen(23, 15, 42);
        hasTeen(22, 23, 24);
    }
}
