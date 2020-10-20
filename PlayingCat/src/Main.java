public class Main {
    public static void main(String[] args) {
        isCatPlaying(true,10);
        isCatPlaying(false,36);
        isCatPlaying(false, 35);
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        boolean status = false;
        if(summer == true) {
            if (temperature >= 25 && temperature <= 45) {
                status = true;
            }
        } else if (temperature >= 25 && temperature <= 35) {
            status = true;
        }
        System.out.println(status);
        return status;
    }
}
