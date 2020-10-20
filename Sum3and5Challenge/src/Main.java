public class Main {
    public static void main(String[] args) {
        int count = 0;
        int total = 0;
        for(int i = 1; i<=1000;i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("Found number = " + i);
                total += i;
                count++;
                if(count == 5) {
                    break;
                }
            }
        }
        System.out.println("Total : " + total);
    }
}
