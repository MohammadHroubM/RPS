package main;
// represent the Player , for simplicity it contains only player name and current choice when playing
public class Player {

    private String name;
    private Choice currentChoice;

    public Player(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCurrentChoice(Choice currentChoice) {
        this.currentChoice = currentChoice;
    }

    public Choice getCurrentChoice() {
        return currentChoice;
    }

}
