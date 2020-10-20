public class Main {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int modulus = 0;
        int megaBytes = 0;
        int restKiloBytes = 0;
        if (kiloBytes > 0) {
            modulus = kiloBytes % 1000;
            if (modulus > 0) {
                megaBytes = (kiloBytes - (kiloBytes % 1000)) / 1000;
                restKiloBytes = kiloBytes - (megaBytes * 1024);
            } else {
                megaBytes = (kiloBytes / 1000) - 1;
                restKiloBytes = kiloBytes - (megaBytes * 1024);
            }
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + restKiloBytes + " KB");
        } else if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else if (kiloBytes == 0) {
            System.out.println("0 KB = 0 MB and 0 KB");
        }
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1);
        printMegaBytesAndKiloBytes(5000);
        printMegaBytesAndKiloBytes(0);

    }
}
