package basic3;

import basic1.improved.AbstractAutomation;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
    	driver.get(getURL());

    	WebElement input = driver.findElement(By.id("lst-ib"));
    	WebElement searchButton = driver.findElement(By.name("btnK")); 
    	//WebElement searchResult = driver.findElement(By.linkText("Selenium WebDriver"));   	
    	
    	input.sendKeys("Selenium WebDriver");
    	searchButton.click();
    	//searchResult.click();
    	

    }
}
