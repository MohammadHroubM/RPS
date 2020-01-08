package test;

import junit.framework.TestCase;
import main.Choice;

public class TestScissors  extends TestCase {

    public void testScissorsBeatsPaper() {

        assertTrue(Choice.SCISSORS.compareChoices(Choice.PAPER) > 0);
        assertFalse(Choice.SCISSORS.compareChoices(Choice.PAPER)<= 0);

    }

    public void testScissorsTiesScissors() {

        assertTrue(Choice.SCISSORS.compareChoices(Choice.SCISSORS) == 0);
        assertFalse(Choice.SCISSORS.compareChoices(Choice.SCISSORS) != 0);
    }

    public void testScissorsLoseToRock() {
        assertTrue(Choice.ROCK.compareChoices(Choice.SCISSORS) > 0);
        assertFalse(Choice.ROCK.compareChoices(Choice.SCISSORS) <= 0);
    }
}
