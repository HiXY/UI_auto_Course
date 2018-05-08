package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

class Task3
{
    void mainMethodTask3()
    {
        System.setProperty("webdriver.chrome.driver", "/home/antihixy/Desktop/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://kino.mail.ru/news/49960_bezrukova_kozhevnikova_mihalkovi_i_tabakov_otkritie_mmkf_2018/");

        Actions actions = new Actions(driver);

        WebElement element = driver.findElement(By.xpath("//span[@class = 'photo__action js-show_photo']"));
        actions.moveToElement(element).click().pause(1100).build().perform();

        actions.moveToElement(driver.findElement(By.xpath("//span[@class = 'icon icon_control_next']"))).click().pause(1100).build().perform();

        actions.moveToElement(driver.findElement(By.xpath("//span[@class = 'icon icon_control_previous']"))).click().pause(1100).build().perform();

        actions.moveToElement(driver.findElement(By.xpath("//span[@class = 'icon icon_close']"))).click().build().perform();
    }
}
