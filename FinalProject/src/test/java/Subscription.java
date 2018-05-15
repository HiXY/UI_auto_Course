import io.qameta.allure.Description;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Subscription
{
    private WebDriver driver;

    @Before
    public void init()                                              //// webdriver initialization
    {
        System.setProperty("webdriver.chrome.driver", "/home/antihixy/Desktop/chromedriver");
        driver = new ChromeDriver();
    }

    @After
    public void close()                                             //// closing webdriver
    {
        if (driver != null)
        {
            driver.quit();
        }
    }

    @Test()
    @Description("Testing apperaing subscription after scrolling down the page")
    public void subscription ()
    {
        driver.get("https://pogoda.mail.ru/prognoz/moskva/ ");          //// getting start page
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Actions action = new Actions(driver);

        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");         //// scroll to the end of page

        action.pause(7000).build().perform();                                   //// waiting for appearance of button
        try
        {
            if(driver.findElement(By.xpath("//button[@data-action = 'subscribe']")).isDisplayed())
            {
                action.moveToElement(driver.findElement(By.xpath("//button[@data-action = 'subscribe']"))).click().pause(2000).build().perform();
            }
            else throw new Exception();                                                     //// trowing exception if not
        }
        catch (Exception e)                                                     //// catching it and saying what went wrong
        {
            assert false: "There is no pushing subscription!";
        }
    }
}
