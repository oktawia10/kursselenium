package com.kurs.log;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class logowanie {

WebDriver driver;

    @Given("^a browser with open https://aavtrain\\.com/index\\.asp$")
    public void aBrowserWithOpenHttpsAavtrainComIndexAsp() {
        System.setProperty("webdriver.gecko.driver",
                "src/test/resources/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
    }

    @When("^user cliks \"([^\"]*)\" button$")
    public void userCliksButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^registration form opens$")
    public void registrationFormOpens() {
    }

    @When("^user input First Name, Last Name, Email Address, Username, Address (\\d+), Number, City, State, Zip, Password$")
    public void userInputFirstNameLastNameEmailAddressUsernameAddressNumberCityStateZipPassword(int arg0) {

    }

    @And("^user click submit button$")
    public void userClickSubmitButton() {
    }

    @Then("^error \"([^\"]*)\"$")
    public void error(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }
}
