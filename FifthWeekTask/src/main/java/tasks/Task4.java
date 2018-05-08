package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

class Task4
{
    void mainMethodTask4()
    {
        System.setProperty("webdriver.chrome.driver", "/home/antihixy/Desktop/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://news.mail.ru/incident/33094804/");

        WebElement element = driver.findElement(By.xpath("//iframe[@id = 'instagram-embed-0']"));

        Actions actions = new Actions(driver);

        driver.switchTo().frame(element);

        WebElement instagrambutton = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/a"));
        actions.moveToElement(instagrambutton).click().pause(1000).build().perform();
    }
}
