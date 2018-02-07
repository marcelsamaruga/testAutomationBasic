package basic5;

import basic1.improved.AbstractAutomation;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Documentation: https://seleniumhq.github.io/selenium/docs/api/java/index.html?org/openqa/selenium/
 */


public class Automation extends AbstractAutomation {

    private static final String PAGE_URL = "https://www.mastercard.us/en-us.html";
    private static final String TO_FIND = "mastercard";

    protected String getURL() {
        return PAGE_URL;
    }

    @Test
    public void testSearch() throws Exception {
        // find the element by XPATH
        WebElement imgElement = driver.findElement( By.xpath("//*[@id=\"cq-image-jsp-/en-us/_jcr_content/contentpar/herobanner/herobannerpar/hero_2032939625/image\"]/img") );

        System.out.println( imgElement.getAttribute("src") );

        assertTrue( "img".equalsIgnoreCase(imgElement.getTagName()) );
        assertThat( imgElement.getAttribute("src"), containsString(TO_FIND) );
    }

}
