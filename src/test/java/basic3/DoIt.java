package basic3;

import basic1.improved.AbstractAutomation;
import org.junit.Test;

/**
 * Documentation: https://seleniumhq.github.io/selenium/docs/api/java/index.html?org/openqa/selenium/
 */


public class DoIt extends AbstractAutomation {

    private static final String PAGE_URL = "http://google.com?gws_rd=cr,ssl&ei=b8VNVu2uFMm6uATkl63YDw&fg=1";

    protected String getURL() {
        return PAGE_URL;
    }

    @Test
    public void doIt() throws Exception {



    }
}
