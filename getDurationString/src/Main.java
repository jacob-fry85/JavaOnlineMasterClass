public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(61, 0));
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(int minutes, int seconds) {
        if(minutes >= 0 && (seconds >= 0 && seconds <= 59)) {
            int h = minutes / 60;
            int m = minutes % 60;
            return h+"h " +m+"m " + seconds+"s";
        } else {
            return "Invalid value";
        }
    }

    public static String getDurationString(int seconds) {
        if(seconds < 0) {
            return "Invalid value";
        }
        int m = seconds / 60;
        int s = seconds % 60;
        return getDurationString(m,s);
    }
}
