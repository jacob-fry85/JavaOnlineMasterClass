public class Main {
    public static boolean isLeapYear(int year) {
        boolean status = false;
        if(year >= 1 && year <= 9999) {
            if(year % 4 == 0) {
                if(year % 100 == 0) {
                    if(year % 400 == 0) {
                        status = true;
                    }
                } else {
                    status = true;
                }
            }
        }
        return status;

    }
    public static void main(String[] args) {
        isLeapYear(-1600);
        isLeapYear(1600);
        isLeapYear(2017);
        isLeapYear(2000);
        isLeapYear(1924);
    }
}
