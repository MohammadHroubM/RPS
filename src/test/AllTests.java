package test;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

    public static Test suite() {
        TestSuite suite = new TestSuite("Test for all");
        suite.addTestSuite(TestRock.class);
        suite.addTestSuite(TestPaper.class);
        suite.addTestSuite(TestScissors.class);
        suite.addTestSuite(TestGame.class);
        return suite;
    }

}