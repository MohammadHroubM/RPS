package main;
/*
Holds the possible choices for the game
 */
public enum Choice {

    ROCK, PAPER, SCISSORS;

    /**
     * Compares this Choice with another Choice to determine a tie, a win, or loss
     */
    public int compareChoices(Choice otherMove) {
        // Tie
        if (this == otherMove)
            return 0;
        switch (this) {
            case ROCK:
                return (otherMove == SCISSORS ? 1 : -1);
            case PAPER:
                return (otherMove == ROCK ? 1 : -1);
            case SCISSORS:
                return (otherMove == PAPER ? 1 : -1);
        }
        return 0;
    }
}
