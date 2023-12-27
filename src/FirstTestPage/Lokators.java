package FirstTestPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Lokators {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("web-driver.chrome.driver","C:\\Users\\ftata\\IdeaProjects\\Selenium2023\\chromedriver-win64");
        ChromeOptions options =new ChromeOptions();
        options.setBinary("C:\\Users\\ftata\\IdeaProjects\\Selenium2023\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/input-form-locator.php");

        driver.findElement( By.id("first_name")).sendKeys("Stasa");
        driver.findElement(By.name("last_name")).sendKeys("Tatalovic");
        driver.findElement(By.name("email")).sendKeys("tatalalka@yahoo.com");

        driver.findElement(By.id("submit_button")).click();

        String title = driver.getTitle();

        if(title.equalsIgnoreCase("_blank")){
            System.out.println("the title is correct");
        }
         else{
             System.out.println("the title is not correct");
        }
        Thread.sleep(10000);

        driver.quit();



    }
}
