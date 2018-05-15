import io.qameta.allure.Description;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SignsTemperature
{
    private WebDriver driver;
    private Pattern pattern;
    private Matcher matcher;                                        //// pattern initialization
    private static final String TEMPERATURE_PATTERN = "^([+-][1-9]\\d?[°]|[0][°])$";

    @Before
    public void init()                                              //// webdriver initialization and pattern compilation
    {
        System.setProperty("webdriver.chrome.driver", "/home/antihixy/Desktop/chromedriver");
        driver = new ChromeDriver();
        pattern = Pattern.compile(TEMPERATURE_PATTERN);
    }

    @After                                                          //// closing webdriver
    public void close()
    {
        if (driver != null)
        {
            driver.quit();
        }
    }

    @Test
    @Description("Testing existence signs before the numbers")
    public void catchingsigns ()
    {
        driver.get("https://pogoda.mail.ru/country/russia/");           //// getting start page
        String number;
                                                                        //// collecting temperatures
        List<WebElement> temperatures = driver.findElements(By.xpath("//span[@class = 'city-list__val city-list__val-temperature']"));

        try
        {
            for (WebElement onefrom : temperatures)                    //// checking if visualization of temperature are correct
            {
                number = onefrom.getText();
                ////System.out.println(string);
                matcher = pattern.matcher(number);
                if (!matcher.matches())
                {
                    throw new Exception();                            //// if not throw exception
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();                                        //// catch exception
        }
    }
}
