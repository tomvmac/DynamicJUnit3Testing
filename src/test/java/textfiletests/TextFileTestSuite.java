package textfiletests;

import junit.framework.TestSuite;

import java.io.File;

public class TextFileTestSuite extends TestSuite {
    public TextFileTestSuite(File directory) {
        super(directory.getName());
        for (File file : directory.listFiles()) {
            if (file.isDirectory())
                addTest(new TextFileTestSuite(file));
            else
                addTest(new TextFileTestCase(file));
        }
    }
}
