package basic3;

import basic1.improved.AbstractAutomation;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

/**
 * Documentation: https://seleniumhq.github.io/selenium/docs/api/java/index.html?org/openqa/selenium/
 */


public class Automation extends AbstractAutomation {

    private static final String SEARCH_TEXT = "Selenium WebDriver";

    private static final String SUBMIT_BUTTON = "btnK";
    private static final String INPUT_TEXT_ID = "lst-ib";

    private static final String PAGE_URL = "http://google.com?gws_rd=cr,ssl&ei=b8VNVu2uFMm6uATkl63YDw&fg=1";

    protected String getURL() {
        return PAGE_URL;
    }

    @Test
    public void testSearch() throws Exception {
        // to get an element by the id and set some values
        driver.findElement( By.id(INPUT_TEXT_ID) )
              .sendKeys( SEARCH_TEXT );

        // get an button element by the id and click on it
        driver.findElement( By.name(SUBMIT_BUTTON) )
              .click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(
            ExpectedConditions.presenceOfElementLocated( By.id("resultStats") )
        );

        for (WebElement element: driver.findElements( By.className("_SWb") )) {
            assertTrue( "div".equalsIgnoreCase(element.getTagName()) );
            System.out.println( element.getText() );
        }


    }


}
