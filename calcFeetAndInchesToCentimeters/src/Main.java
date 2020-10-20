public class Main {
    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(-10);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        double centimeters = -1;
        if(feet >= 0 && (inches >=0 && inches <= 12)) {
            centimeters = (feet * 2.54 * 12) + (inches * 2.54);
            System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        } else {
            System.out.println("invalid feet or inches parameters");
        }
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        double feet = -1;
        double remainingInches = 0;
        if(inches >=0) {
            feet = (int)inches / 12;
            remainingInches = (int)inches % 12;
            System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches" );
        }
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}
