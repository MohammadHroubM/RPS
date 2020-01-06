package main;

public class Rock implements Choice {

    @Override
    public int beats(Choice opponent) {

        if(opponent.getClass() == Scissors.class)
            return 1;

        if(opponent.getClass() == Paper.class)
            return -1;

        return 0;
    }
}
