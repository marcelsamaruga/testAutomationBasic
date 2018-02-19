package basic4;

import basic1.improved.AbstractAutomation;
import org.junit.Test;

/**
 * Documentation: https://seleniumhq.github.io/selenium/docs/api/java/index.html?org/openqa/selenium/
 */


public class DoIt extends AbstractAutomation {

    private static final String PAGE_URL = "http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select";

    protected String getURL() {
        return PAGE_URL;
    }

    @Test
    public void doIt() throws Exception {



    }
}
