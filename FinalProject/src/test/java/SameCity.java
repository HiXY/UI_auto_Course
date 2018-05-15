import io.qameta.allure.Description;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

////import java.util.Arrays;
import java.util.List;

public class SameCity
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

    @Test
    @Description("Checking description of same cities")
    public void citycheck()
    {
        driver.get("https://pogoda.mail.ru/country/russia/july-2015/a/");       //// getting start page

        ////List<WebElement> cities = driver.findElements(By.xpath("//a[contains(@href, '/prognoz/')]"));
                                                                                //// collecting cities in the list
        List<WebElement> cities = driver.findElements(By.xpath("//div[@class = 'city-list__simple']"));

        for (int i = 0; i < cities.size(); ++i)                                 //// checking same cities
        {
            String[] firstcity = cities.get(i).getText().split("\\s");          //// take first city
            ////System.out.println(Arrays.toString(firstcity) + firstcity.length);
            if (firstcity.length >= 2)
            {
                for (int j = i + 1; j < cities.size(); ++j)
                {
                    String[] secondcity = cities.get(j).getText().split("\\s");     //// take the same city
                    ////System.out.println(Arrays.toString(secondcity) + secondcity.length);
                    if (secondcity.length >= 2)                              //// if they have speciality then correct
                    {
                        assert !firstcity[0].equals(secondcity[0]) || (firstcity[1] != null && secondcity[1] != null) : "Incorrect display of same cities!";
                        i++;                                                //// take next city
                        break;
                    }
                }
            }
        }
    }
}
