package basic2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Documentation: https://seleniumhq.github.io/selenium/docs/api/java/index.html?org/openqa/selenium/
 */


public class DoIt {

    private WebDriver driver;
    private final String URL = "http://www.w3schools.com/html/html_form_input_types.asp";

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
    }

    @After
    public void tearDown() throws Exception {
        // close the browser
        driver.quit();
    }

    @Test
    public void doIt() throws Exception {
        // the get method forwards to a specific URL
        driver.get(URL);


    }

}
