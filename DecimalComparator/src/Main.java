public class Main {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        boolean status = false;
        int firstNumber = 0;
        int secondNumber = 0;
        int round1 = (int)Math.round(num1);
        int round2 = (int)Math.round(num2);

        if((round1 == round2) && ((num1 >= 0 & num2 >= 0) || (num1 <= 0 & num2 <= 0))) {
            num1 = (double)(num1 * 1000);
            num2 = (double)(num2 * 1000);
            firstNumber = (int)(num1 % 1000);
            secondNumber = (int)(num2 % 1000);
            if(firstNumber == secondNumber)
                status = true;
        }
        return status;
    }
    public static void main(String[] args) {
        /*areEqualByThreeDecimalPlaces(-3.1758, -3.175);
        areEqualByThreeDecimalPlaces(3.175, 3.176);
        areEqualByThreeDecimalPlaces(3.0, 3.0);
        areEqualByThreeDecimalPlaces(-3.123,3.123);*/

        areEqualByThreeDecimalPlaces(4.0,5.0);
        System.out.println("num1 : " + num1 + " num2 : " + num2);
        System.out.println("firstNumber : " + firstNumber + " secondNumber : " + secondNumber);

    }
}
