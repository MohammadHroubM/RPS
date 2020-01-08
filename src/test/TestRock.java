package test;
import junit.framework.TestCase;
import main.Choice;

public class TestRock extends TestCase {

    public void testRockBeatsScissors() {

        assertTrue(Choice.ROCK.compareChoices(Choice.SCISSORS) > 0);
        assertFalse(Choice.SCISSORS.compareChoices(Choice.ROCK)>= 0);

    }

    public void testRockTiesRock() {

        assertTrue(Choice.ROCK.compareChoices(Choice.ROCK) == 0);
        assertFalse(Choice.ROCK.compareChoices(Choice.ROCK) != 0);
    }

    public void testRockLoseToPaper() {
        assertTrue(Choice.PAPER.compareChoices(Choice.ROCK) > 0);
        assertFalse(Choice.PAPER.compareChoices(Choice.ROCK) <= 0);
    }

}