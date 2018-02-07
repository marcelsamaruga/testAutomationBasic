package basic4;

import basic1.improved.AbstractAutomation;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Documentation: https://seleniumhq.github.io/selenium/docs/api/java/index.html?org/openqa/selenium/
 */


public class Automation extends AbstractAutomation {

    private static final String PAGE_URL = "http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select";

    protected String getURL() {
        return PAGE_URL;
    }

    @Test
    public void testSearch() throws Exception {
        List<WebElement> dropDownListElements = navigateToSelect();

        List<String> valuesFromDropDownList = new ArrayList<String>();

        // set any value on the element
        for (WebElement element : dropDownListElements ) {
            assertTrue( "option".equalsIgnoreCase(element.getTagName()) );
            System.out.println( element.getText() );
            valuesFromDropDownList.add( element.getText() );
        }


        assertThat( new String[] {"Volvo", "Saab", "Opel", "Audi"}, is(equalTo(valuesFromDropDownList.toArray() )) );

        // get to the original state (PAGE_URL)
        driver.switchTo().defaultContent();
    }


    // navigate on the url
    public List<WebElement> navigateToSelect(){
        // switchTo: to navigate by the windows
        driver.switchTo().frame("iframeResult");

        WebElement dropdownListElement = driver.findElement( By.cssSelector("select") );

        // instantiate Select object
        Select dropDownList = new Select( dropdownListElement );

        assertTrue( dropDownList.getOptions().size() > 0 );

        // get the options of the select element
        return dropDownList.getOptions();
    }


}
