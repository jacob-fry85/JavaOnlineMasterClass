public class Main {
    public static void main(String[] args) {
        int newScore = calculateScore("Darwin", 1500);
        System.out.println("New score is " + newScore);

        calculateScore(2500);
        calculateScore();
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " [points]");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed Player scored " + score + " [points]");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 1000;
    }
}
