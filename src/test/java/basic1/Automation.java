package basic1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

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
        driver.get("https://translate.google.com/");
    }

    @After
    public void tearDown() throws Exception {
        // close the browser
        driver.quit();
    }

    @Test
    public void testTranslation() throws Exception {
        // to get an element by the id
        WebElement input = driver.findElement( By.id("source") );

        // set any value on the element
        input.sendKeys("Testing");

        // get an button element by the id
        WebElement searchButton = driver.findElement( By.id("gt-submit") );

        // click on the button
        searchButton.click();

        assertEquals( "Testing", input.getAttribute("value")  );
    }

}
