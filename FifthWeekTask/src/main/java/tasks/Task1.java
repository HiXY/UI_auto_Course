package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

class Task1
{

    void mainMethodTask1() throws IOException
    {                                                                       //// creating driver for GoogleChrome
        System.setProperty("webdriver.chrome.driver", "/home/antihixy/Desktop/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://pets.mail.ru/news/");                           //// getting our website

        List<WebElement> links = driver.findElements(By.xpath("//a[@href]"));       //// collecting all url

        List<String> absoluteurl = new LinkedList<>();                              //// creating lists for keeping urls
        List<String> externalurl = new LinkedList<>();
                                                                                    //// creating output file of our urls
        FileWriter writer = new FileWriter("resultTask1.txt");
        ////FileWriter writer = new FileWriter("/home/antihixy/Mail-Java-Tasks/FifthWeekTask/src/test/java/pages/otherProjects/result.txt");

        for(WebElement link : links)                                                //// sorting url and deleting empty
        {
            if (!link.getText().isEmpty() && link.getAttribute("href").contains("https://mail.ru/"))
            {
                ((LinkedList<String>) absoluteurl).addFirst(link.getText());
            }
            else if (!link.getText().isEmpty())
            {
                ((LinkedList<String>) externalurl).addFirst(link.getText());
            }
        }
                                                                                //// output all our url from website
        writer.write("External: " + String.valueOf(externalurl.size()));
        writer.write("\n");

        for(String url : externalurl)
        {
            writer.write(url);
            writer.write("\n");
        }

        writer.write("\n");

        writer.write("Absolute: " + String.valueOf(absoluteurl.size()));
        writer.write("\n");

        for(String url : absoluteurl)
        {
            writer.write(url);
            writer.write("\n");
        }

        writer.close();

    }
}
