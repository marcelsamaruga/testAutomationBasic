package basic2.improved;

import basic1.improved.AbstractAutomation;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

/**
 * Documentation: https://seleniumhq.github.io/selenium/docs/api/java/index.html?org/openqa/selenium/
 */


public class Automation2 extends AbstractAutomation {

    private static final String TRANSLATE_SOURCE = "Testing";

    private static final String SOURCE_ID = "source";
    private static final String SUBMIT_BUTTON = "gt-submit";

    private static final String PAGE_URL = "http://translate.google.com";

    protected String getURL() {
        return PAGE_URL;
    }

    @Test
    public void testTranslation() throws Exception {
        // to get an element by the id
        WebElement input = driver.findElement( By.id(SOURCE_ID) );

        // set any value on the element
        input.sendKeys( TRANSLATE_SOURCE );

        // get an button element by the id
        WebElement searchButton = driver.findElement( By.id(SUBMIT_BUTTON) );

        // click on the button
        searchButton.click();

        assertEquals( TRANSLATE_SOURCE, input.getAttribute("value") );

        Thread.sleep(1 * 1000);

        WebElement elementTranslated = driver.findElement( By.id("result_box") );
        assertEquals( TRANSLATE_SOURCE,  elementTranslated.getText() );
    }


}
