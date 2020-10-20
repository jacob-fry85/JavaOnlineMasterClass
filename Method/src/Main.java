public class Main {
    public static int calculateScore(boolean status, int score, int level, int bonus) {
        if (status) {
            int finalScore = score + (level * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }
    public static void main(String[] args) {
        int result = 0;
        result = calculateScore(true, 800, 5, 100 );;
        System.out.println("Your final score was " + result);
        result = calculateScore(true, 10000, 8, 200 );
        System.out.println("Your final score was " + result);
    }
}
