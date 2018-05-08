package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

class Task2
{
    void mainMethodTask2()
    {
        System.setProperty("webdriver.chrome.driver", "/home/antihixy/Desktop/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://pets.mail.ru/news/");

        Actions actions = new Actions(driver);

        List<WebElement> articles = driver.findElements(By.xpath("//div[@class = 'pypo-item js-pgng_item']"));
        int previous_size = articles.size() - 1;
        int present_size = articles.size();

        while((driver.findElement(By.xpath("//button[@name = 'clb28641920']")).isDisplayed()) && (previous_size < present_size))
        {
            actions.moveToElement(driver.findElement(By.xpath("//button[@name = 'clb28641920']"))).click().pause(1100).build().perform();
            List<WebElement> articlesafterpress = driver.findElements(By.xpath("//div[@class = 'pypo-item js-pgng_item']"));
            previous_size = present_size;
            present_size = articlesafterpress.size();
        }
    }
}
