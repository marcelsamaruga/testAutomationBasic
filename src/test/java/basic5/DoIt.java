package basic5;

import basic1.improved.AbstractAutomation;
import org.junit.Test;

/**
 * Documentation: https://seleniumhq.github.io/selenium/docs/api/java/index.html?org/openqa/selenium/
 */


public class DoIt extends AbstractAutomation {

    private static final String PAGE_URL = "https://www.mastercard.us/en-us.html";
    private static final String TO_FIND = "mastercard";

    protected String getURL() {
        return PAGE_URL;
    }

    @Test
    public void doIt() throws Exception {



    }
}
