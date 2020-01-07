
public class TestPaper extends TestCase {

    public void testPaperBeatsRock() {
        Paper paper = new Paper();
        Rock rock = new Rock();
        assertTrue(paper.beats(rock) > 0);
        assertFalse(rock.beats(paper) >= 0);

    }

    public void testPaperTiesPaper() {
        Paper paper1 = new Paper();
        Paper paper2 = new Paper();
        assertTrue(paper1.beats(paper2) == 0);
        assertFalse(paper1.beats(paper2) > 0);
        assertFalse(paper1.beats(paper2) < 0)
    }

    public void testPaperLoseToScissor() {
        Scissor scissor = new Scissor();
        Paper paper = new Paper();
        assertTrue(scissor.beats(paper) >0);
        assertFalse(paper.beats(scissor) >= 0);
    }


}A