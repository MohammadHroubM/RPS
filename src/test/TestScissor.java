
public class TestRock extends TestCase {

    public void testScissorLoseToRock() {
        Scissor scissor = new Scissor();
        Rock rock = new Rock();
        assertTrue(rock.beats(scissor) > 0);
        assertFalse(scissor.beats(scissor) >= 0);

    }

    public void testScissorTiesScissor() {
        Scissor scissor1 = new Scissor();
        Scissor scissor2 = new Scissor();
        assertTrue(scissor1.beats(scissor2) == 0);
        assertFalse(scissor1.beats(scissor2) > 0);
        assertFalse(scissor1.beats(scissor2) < 0)
    }

    public void testScissorBeatsPaper() {
        Scissor scissor = new Scissor();
        Paper paper = new Paper();
        assertTrue(scissor.beats(paper) >0);
        assertFalse(scissor.beats(paper) <= 0);
    }


}