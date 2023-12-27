package FirstTestPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.List;

public class LokatorBtn {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("web-driver.chrome.driver","C:\\Users\\ftata\\IdeaProjects\\Selenium2023\\chromedriver-win64");
        ChromeOptions options =new ChromeOptions();
        options.setBinary("C:\\Users\\ftata\\IdeaProjects\\Selenium2023\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/buttons-locators.php");

 WebElement link1=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[1]/a"));
link1.sendKeys("Link 1");
 ;
 Thread.sleep(2000);
WebElement link2=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[2]/a"));

link2.sendKeys("Link 2");
Thread.sleep(2000);
WebElement link3 =driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[3]/a"));

link3.sendKeys("Link 3");
        Thread.sleep(2000);
WebElement link4=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[4]/a"));
link4.sendKeys("Link 4");
        Thread.sleep(2000);
WebElement link5 =driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[5]/a"));
link5.sendKeys("Link 5");
link5.click();

driver.quit();

    }
}
