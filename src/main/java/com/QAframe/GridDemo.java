package com.QAframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import static java.lang.Thread.sleep;

public class GridDemo {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException, MalformedURLException {
        // System.setProperty("webdriver.chrome.driver","C:/Users/Ajinkya/Downloads/Browser_kits/chromedriver.exe");

        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setBrowserName("chrome");
        try{
            driver = new RemoteWebDriver(new URL("http://10.20.30.20:4444"), dc);
        }
        catch (MalformedURLException e){
            e.printStackTrace();
        }

        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.findElement(By.cssSelector("input[title='Search']")).sendKeys("Selenium");
        sleep(2000);
        driver.navigate().to("https://www.yahoo.com");
        driver.switchTo().newWindow(WindowType.WINDOW);
// Opens LambdaTest homepage in the newly opened window
        driver.navigate().to("https://www.lambdatest.com/");
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.navigate().to("https://www.news.google.com");
        sleep(3000);
        driver.quit();

        //http://192.168.2.33:4444 - hub IP


    }

}
