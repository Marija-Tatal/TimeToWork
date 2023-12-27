package FirstTestPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathLocators {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("web-driver.chrome.driver","C:\\Users\\ftata\\IdeaProjects\\Selenium2023\\chromedriver-win64");
        ChromeOptions options =new ChromeOptions();
        options.setBinary("C:\\Users\\ftata\\IdeaProjects\\Selenium2023\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/Xpath.php");

        driver.findElement(By.name("exactUserEntry")).sendKeys("Marija");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[2]/form/div/button")).click();
        driver.findElement(By.name("089securityPartial123456")).sendKeys("metodologija");
        Thread.sleep(2000);
        driver.findElement(By.name("052apiSettings1234567")).sendKeys("abrakadabra");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[6]/div[2]/div/div[1]/form/div/input")).sendKeys("marija@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[6]/div[2]/div/div[2]/form/div/input")).sendKeys("joshi@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[6]/div[2]/div/div[3]/form/div/input")).sendKeys("stasha@gmail.com");

        driver.findElement(By.name("customField")).sendKeys("Names");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[7]/div[2]/div/div[2]/form/div/input")).sendKeys("Full Xpath");
Thread.sleep(2000);
driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[8]/div[2]/div/div[1]/form/div/input")).sendKeys("My Full Xpath");
Thread.sleep(2000);
driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[8]/div[2]/div/div[2]/form/div/input")).sendKeys("drugacije nije moglo :)");
        driver.quit();
    }

}
