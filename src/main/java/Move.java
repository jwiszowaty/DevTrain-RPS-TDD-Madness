public class Move {
    public static final int ROCK = 0;
    public static final int SCISSORS = 2;
    public static final int PAPER = 1;
    public static boolean beats(int player1move, int player2move) {
        if(player1move == ROCK) {
            return player2move == SCISSORS;
        } else if (player1move == PAPER) {
            return player2move== ROCK;
        } else if (player1move == SCISSORS) {
            return player2move == PAPER;
        }
        return false;
    }
}
