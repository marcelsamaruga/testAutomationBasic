package basic1.improved;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by e068636 on 1/8/2018.
 */
public abstract class AbstractAutomation {

    protected WebDriver driver;

    protected abstract String getURL();

    @Before
    public void setUp() throws Exception {
        loadDriver();

        // create the Google Chrome Driver
        driver = new ChromeDriver();

        // maximize the browser
        driver.manage().window().maximize();

        //
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        // the get method forwards to a specific URL
        driver.get( getURL() );
    }

    @After
    public void tearDown() throws Exception {
        // close the browser
        driver.quit();
    }

    private void loadDriver() {
        // apply the browser settings on the application system properties
        System.setProperty("browser", "chrome");

        if (System.getProperty("webdriver.chrome.driver") == null ) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");
        }
    }
}
