package basic2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Documentation: https://seleniumhq.github.io/selenium/docs/api/java/index.html?org/openqa/selenium/
 */


public class Automation {

    private WebDriver driver;

    @Before
    public void setUp() throws Exception {

        // apply the browser settings on the application system properties
        System.setProperty("browser", "chrome");

        if (System.getProperty("webdriver.chrome.driver") == null ) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");
        }
        // ***

        // create the Google Chrome Driver
        driver = new ChromeDriver();

        // maximize the browser
        driver.manage().window().maximize();

        //
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        // the get method forwards to a specific URL
        driver.get("http://www.w3schools.com/html/html_form_input_types.asp");
    }

    @After
    public void tearDown() throws Exception {
        // close the browser
        //driver.quit();
    }



    @Test
    public void testCheckboxes_W3Schools() throws Exception {
        // to get an element by the name
        WebElement checkbox1 = driver.findElement( By.name("vehicle1") );
        
        checkbox1.click();

        // the checkbox element has a method isSelected(): true/false
        boolean isFirstSelected = checkbox1.isSelected();

        // assert: junit method to validate a specific condition
        assertTrue(isFirstSelected);

        // it prints out on the console
        System.out.println(checkbox1.getAttribute("value") + ": " + isFirstSelected);

        WebElement checkbox2 = driver.findElement(By.name("vehicle2"));
        boolean isSecondSelected = checkbox2.isSelected();
        assertFalse(isSecondSelected);
        System.out.println(checkbox2.getAttribute("value") + ": " + isSecondSelected);
    }

}
