package com.QAframe.StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Print {

    WebDriver driver = null;

    WebDriver d1 = null;

    @Given("^nothing but everything$")
    public void hello_world() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Hello World");
    }

    @When("^google home page open$")
    public void google_home() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        Thread.sleep(2000);
        driver.close();
    }

    @Then("^The user should be able to sendkeys$")
    public void sendkeys(){
        d1 = new ChromeDriver();
        d1.get("https://www.google.com");
        d1.findElement(By.name("q")).sendKeys("Animal");
        d1.findElement(By.name("q")).click();
        d1.close();
    }

    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
    }


}
