public class AllTests {

    public static Test suite() {
        TestSuite suite = new TestSuite("Test for all");
        suite.addTestSuite(TestRock.class);
        suite.addTestSuite(TestPaper.class);
        suite.addTestSuite(TestScissor.class);
        suite.addTestSuite(TestGame.class);
        return suite;
    }

}