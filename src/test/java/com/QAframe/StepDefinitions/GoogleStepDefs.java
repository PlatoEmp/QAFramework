package com.QAframe.StepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GoogleStepDefs {

    @Given("^Launch Google Homepage$")
    public void launchGoogle(){

        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        String acttitle = "Google";
        Assert.assertTrue(driver.getTitle().equals(acttitle));
        driver.close();
    }
}
