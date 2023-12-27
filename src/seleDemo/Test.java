package seleDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test {
    public static void main(String[] args) {

    System.setProperty("web-driver.chrome.driver","C:\\Users\\ftata\\IdeaProjects\\Selenium2023\\chromedriver-win64");
        ChromeOptions options =new ChromeOptions();
        options.setBinary("C:\\Users\\ftata\\IdeaProjects\\Selenium2023\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.rs/");
        driver.quit();

    }
}
