public class Challenge {
    public static void displayHighScorePosition(String playersName, int highScorePosition) {
        System.out.println(playersName + " managed to get into position " +
                highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playersScore) {
        int position = 4;

        if (playersScore >= 1000) {
            position =  1;
        } else if (playersScore >= 500) {
            position =  2;
        } else if (playersScore >= 100) {
            position = 3;
        }

        return position;

    }

    public static void main(String[] args) {
        displayHighScorePosition("Darwin Tirta", calculateHighScorePosition(1000));
        displayHighScorePosition("Jacob", calculateHighScorePosition(500));
        displayHighScorePosition("Tidus", calculateHighScorePosition(300));
        displayHighScorePosition("Gilbert", calculateHighScorePosition(50));
    }
}
