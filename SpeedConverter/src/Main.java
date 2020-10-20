public class Main {
    public static long toMilesPerHour(double kilometersPerHour) {
        long milesPerHour = 0;

        if (kilometersPerHour > 0) {
            milesPerHour = Math.round(kilometersPerHour * 0.622);

        } else if (kilometersPerHour < 0) {
            milesPerHour = -1;
        }
        return milesPerHour;
    }

    public static void printConversion(double kilometersPerHour) {
        long milesPerHour = 0;

        if (kilometersPerHour > 0 || kilometersPerHour == 0) {
            milesPerHour = Math.round(kilometersPerHour * 0.622);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        } else if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        }
    }

    public static void main(String[] args) {
        printConversion(95.75);
        printConversion(100.4);
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
        printConversion(0);
    }
}
