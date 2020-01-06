package main;

public class Scissors implements Choice {

    @Override
    public int beats(Choice opponent) {

        if(opponent.getClass() == Paper.class)
            return 1;

        if(opponent.getClass() == Rock.class)
            return -1;

        return 0;

    }
}
