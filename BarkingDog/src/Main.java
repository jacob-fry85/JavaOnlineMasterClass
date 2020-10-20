public class Main {
    public static boolean shouldWakeUp(boolean bool, int hourOfDay) {
        boolean status = true;
        if (bool == true) {
            if (hourOfDay >= 0 && hourOfDay <= 23) {
                if (hourOfDay < 8 || hourOfDay > 22) {
                    status = true;
                } else {
                    status = false;
                }
            } else if (hourOfDay < 0 || hourOfDay > 23) {
                status = false;
            }
        } else {
            status = false;
        }
        return status;
    }

    public static void main(String[] args) {
        shouldWakeUp(true, 1);
        shouldWakeUp(false, 2);
        shouldWakeUp(true, 8);
        shouldWakeUp(true, -1);
    }
}
