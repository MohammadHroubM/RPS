package main;

public interface Choice {

    /**
     * Return 1 if  winning
     * Return -1  if losing
     * Return 0 when it is a tie
     *
     */
    int beats(Choice opponent);
}
