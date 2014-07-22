package textfiletests;

import junit.framework.TestCase;

import java.io.File;

public class TextFileTestCase extends TestCase {
    private File file;

    public TextFileTestCase(){
        super();
    }

    public TextFileTestCase(File file) {
        super();
        this.file = file;
        setName(file.getName());
    }

    protected void runTest() throws Throwable {
        assertTrue(file.getName().endsWith(".txt"));
    }
}