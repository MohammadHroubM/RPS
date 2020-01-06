package main;

public class Paper implements Choice {

@Override
    public int beats(Choice opponent) {

        if(opponent.getClass() == Rock.class)
            return 1;

        if(opponent.getClass() == Scissors.class)
            return -1;

        return 0;
    }
}
