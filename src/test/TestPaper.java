package test;

import junit.framework.TestCase;
import main.Choice;

public class TestPaper extends TestCase {

    public void testPaperBeatsRock() {

        assertTrue(Choice.PAPER.compareChoices(Choice.ROCK) > 0);
        assertFalse(Choice.ROCK.compareChoices(Choice.PAPER)>= 0);

    }

    public void testPaperTiesPaper() {

        assertTrue(Choice.PAPER.compareChoices(Choice.PAPER) == 0);
        assertFalse(Choice.PAPER.compareChoices(Choice.PAPER) != 0);
    }

    public void testPaperLoseToScissor() {
        assertTrue(Choice.SCISSORS.compareChoices(Choice.PAPER) > 0);
        assertFalse(Choice.SCISSORS.compareChoices(Choice.PAPER) <= 0);
    }

}