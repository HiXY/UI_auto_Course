import io.qameta.allure.Description;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static junit.framework.TestCase.assertEquals;

public class NewsNotFound
{
    private WebDriver driver;

    @Before
    public void init()                                              //// webdriver initialization
    {
        System.setProperty("webdriver.chrome.driver", "/home/antihixy/Desktop/chromedriver");
        driver = new ChromeDriver();
    }

    @After                                                          //// closing webdriver
    public void close()
    {
        if (driver != null)
        {
            driver.quit();
        }
    }

    @Test ()
    @Description("Testing transition to News main page.")
    public void click_and_transition()
    {
        driver.get("https://news.mail.ru/404/");                    //// getting statring url
        Actions action = new Actions(driver);

        WebElement link = driver.findElement(By.xpath("//a[@href = '/']"));     //// found url for transition and transit
        action.pause(10000).moveToElement(link).click().build().perform();

        String url = driver.getCurrentUrl();                                    //// checking if our transition is successful

        assertEquals("https://news.mail.ru/", url);                     //// if not throw assertion
    }
}
