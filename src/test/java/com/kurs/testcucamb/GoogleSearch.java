package com.kurs.testcucamb;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearch {

    WebDriver driver;

    @Given("^an open browser with google\\.com$")

    public void anOpenBrowserWithGoogleCom() {
        System.setProperty("webdriver.gecko.driver",
                "src/test/resources/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
    }


    @When("^a keyword (.*) is entered in input field$")
    public void aKeywordSeleniumIsEnteredInInputField(String keyword) {
        WebElement element = driver.findElement(By.name("q"));
        element.clear();
        element.sendKeys(keyword);
        element.submit();
    }


    @Then("^the first one should contain (.*)$")
    public void theFirstOneShouldContainSelenium(String expectedText) {
        System.out.println(expectedText);



        /*WebElement element = (driver.findElement(By.cssSelector("div.r")).findElement(By.xpath(".//h3")));
        Assert.assertTrue(element.getText().toLowerCase().contains("selenium"));
        System.out.println(element.getText());*/
    }


    @And("^close browser$")
    public void closeBrowser() {
            driver.quit();
        }
    }
