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
    public void init()
    {
        System.setProperty("webdriver.chrome.driver", "/home/antihixy/Desktop/chromedriver");
        driver = new ChromeDriver();
    }

    @After
    public void close()
    {
        if (driver != null)
        {
            driver.quit();
        }
    }

    @Test()
    @Description("Testing apperaing subscription after scrolling down the page")
    public void subscription () throws Exception
    {
        driver.get("https://pogoda.mail.ru/prognoz/moskva/ ");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Actions action = new Actions(driver);

        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        action.pause(7000).build().perform();
        try
        {
            if(driver.findElement(By.xpath("//button[@data-action = 'subscribe']")).isDisplayed())
            {
                action.moveToElement(driver.findElement(By.xpath("//button[@data-action = 'subscribe']"))).click().pause(2000).build().perform();
            }
        }
        catch (Exception e)
        {
            assert false: "There is no pushing subscription!";
        }
    }
}
