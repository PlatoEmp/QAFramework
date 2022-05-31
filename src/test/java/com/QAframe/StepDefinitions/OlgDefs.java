package com.QAframe.StepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class OlgDefs {

    WebDriver driver = null;
    WebDriver d1 = null;
    WebDriver d2 = null;
    WebDriver w1 = null;

    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
    }

    @Given("^OLG homeURL$")
    public void HomeURL(){

        driver = new ChromeDriver();
        driver.get("https://www.olg.ca/en/home.html");
        driver.manage().window().maximize();
        String url = driver.getCurrentUrl();
        System.out.println(url);
        driver.close();
    }

    @When("^Page title is properly verified$")
    public void HomeTitle(){

        d1 = new ChromeDriver();
        d1.get("https://www.olg.ca/en/home.html");
        d1.manage().window().maximize();
        String olg_actual = "OLG | Ontario's Online LOTTERY, CASINO & SPORTS 2022";
        Assert.assertTrue(d1.getTitle().equals(olg_actual));
        d1.close();
    }

    @When("^URL is properly verified$")
    public void Verify_URL(){
        d2 = new ChromeDriver();
        d2.get("https://www.olg.ca/en/home.html");
        d2.manage().window().maximize();
        String olg_actual_url = "https://www.olg.ca/en/home.html";
        Assert.assertTrue(d2.getCurrentUrl().equals(olg_actual_url));
        d2.close();
    }

    @Then("^The user should navigate to Sign Up$")
    public void Next_Steps(){
        w1 = new ChromeDriver();
        w1.get("https://www.olg.ca/en/home.html");
        w1.manage().window().maximize();
        w1.navigate().to("https://www.olg.ca/en/account/registration.html#/pre-registration");
        String u1 = "https://www.olg.ca/en/account/registration.html#/pre-registration";
        Assert.assertTrue(w1.getCurrentUrl().equals(u1));
        w1.close();
    }

}
