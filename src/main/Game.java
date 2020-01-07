package main;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Game {
    private ArrayList<Choice> choices;
    private int numberOfRounds;
    private ArrayList<Player> players;

    //needed to randomize user choice
    private Random random;

    //initiate the game, add all choices
    private Game() {
        choices = new ArrayList<>();
        choices.add(new Paper());
        choices.add(new Rock());
        choices.add(new Scissors());
    }

    /*
    start Game For two players , only number of rounds is needed
     */
    public boolean startGameForTwoPlayers(int numberOfRounds, String player1Name, String player2Name) {

        Player p1 = new Player(player1Name);
        Player p2 = new Player(player2Name);

        this.numberOfRounds = numberOfRounds;

        try {
            for (int i = 0; i < numberOfRounds; i++) {
                p1.setCurrentChoice(new Rock());
                p2.setCurrentChoice(randomizeChoice());

                if (p1.getCurrentChoice().beats(p2.getCurrentChoice()) > 0) {
                    System.out.println(p1.getName() + " Won round " + i);
                } else if (p1.getCurrentChoice().beats(p2.getCurrentChoice()) < 0) {
                    System.out.println(p2.getName() + " Won round " + i);
                } else {
                    System.out.println("Round " + i + " is draw");
                }
            }
            return true

        } catch (Exception ex) {
            ex.printStackTrace()
            return false

        }

        return true

    }

    //ToDo -- implement the game for any number of players
    public void startGame(ArrayList<Player> players, int numberOfRounds) {
        //ToDo -- implement the game for any number of players
    }

    public int getNumberOfRounds() {
        return numberOfRounds;
    }

    //This method used when we need to randomly pick a choice ie testing
    public Choice randomizeChoice() {
        ArrayList<Choice> choices = this.choices;
        return choices.get(random.nextInt(choices.size()));
    }
}
