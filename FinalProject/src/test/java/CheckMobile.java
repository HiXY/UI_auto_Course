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


public class CheckMobile
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
    @Description("Testing transition to mobile version of the page and back.")
    public void mobile_and_back ()
    {
        String version;
        driver.get("https://news.mail.ru/");
        Actions action = new Actions(driver);

        WebElement mobilelink = driver.findElement(By.xpath("//a[@href = '/go-mobile/']"));
        action.moveToElement(mobilelink).pause(3000).click().build().perform();

        WebElement normallink = driver.findElement(By.xpath("//a[@href = '/go-web/']"));
        action.moveToElement(normallink).pause(3000).click().build().perform();

        if (driver.findElement(By.xpath("//a[@href = '/go-mobile/']")).isDisplayed())
        {
            version = "Full";
        }
        else
        {
            version = "Mobile";
        }

        assertEquals("Full", version);

    }
}
