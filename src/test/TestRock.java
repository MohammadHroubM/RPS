
public class TestRock extends TestCase {

    public void testRockLoseToPaper() {
        Paper paper = new Paper();
        Rock rock = new Rock();
        assertTrue(paper.beats(rock) > 0);
        assertFalse(rock.beats(paper) >= 0);

    }

    public void testRockTiesRock() {
        Rock rock1 = new Rock();
        Rock rock2 = new Rock();
        assertTrue(rock1.beats(rock2) == 0);
        assertFalse(rock1.beats(rock2) > 0);
        assertFalse(rock1.beats(rock2) < 0)
    }

    public void testRockBeatsScissor() {
        Scissor scissor = new Scissor();
        Rock rock = new Paper();
        assertTrue(rock.beats(scissor) >0);
        assertFalse(rock.beats(scissor) <= 0);
    }


}