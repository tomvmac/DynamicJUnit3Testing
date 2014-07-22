package textfiletests;

import junit.framework.Test;
import junit.framework.TestSuite;

import java.io.File;

public class AllTests {
    private static final String TEST_FOLDER = "c:\\MyTemp\\testdata";

    public static Test suite() {
        TestSuite suite = new TestSuite(
                "Test for net.jorgemanrubia.junitdinamically.sample");
        //$JUnit-BEGIN$
        suite.addTest(new TextFileTestSuite(new File(TEST_FOLDER)));
        //$JUnit-END$
        return suite;
    }
}
