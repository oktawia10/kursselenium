package com.kurs.selenium;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Zadanie10 {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver",
                "src/test/resources/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");
    }

    @Test
    public void TestKatalonForm() {

        WebElement element1 = driver.findElement(By.xpath("/html/body/div/div/form/div[1]/label"));
        System.out.print(element1.getText());

        WebElement firstNameElement = driver.findElement(By.id("first-name"));
        if (firstNameElement.isDisplayed()) {
            firstNameElement.click();
        }
        firstNameElement.sendKeys("Jan");
        System.out.println(": " + firstNameElement.getAttribute ("value"));

        WebElement element2 = driver.findElement(By.xpath("/html/body/div/div/form/div[2]/label"));
        System.out.print(element2.getText());

        WebElement lastNameElement = driver.findElement(By.id("last-name"));
        if (lastNameElement.isDisplayed()) {
            lastNameElement.click();
        }
        lastNameElement.sendKeys("Kot");
        System.out.println(": " + lastNameElement.getAttribute ("value"));

        WebElement element3 = driver.findElement(By.xpath("/html/body/div/div/form/div[3]/label"));
        System.out.print(element3.getText() +": ");

        List<WebElement> genders = driver.findElements(By.name("gender"));
        if (genders.get(1).isDisplayed()){
        genders.get(1).click();} //w nawiasie który element 0 lub 2

        for (WebElement i : genders){
            if (i.isSelected()){

                WebElement genderLabel = i.findElement(By.xpath("./.."));
                System.out.println(genderLabel.getText());
            }
        }

        WebElement element4 = driver.findElement(By.xpath("/html/body/div[1]/div/form/div[4]/label"));
        System.out.print(element4.getText());

        WebElement dataUrodzenia= driver.findElement(By.id("dob"));
        if (dataUrodzenia.isDisplayed()){
        dataUrodzenia.sendKeys("05/22/1980");
        }
        System.out.println(": " + dataUrodzenia.getAttribute ("value"));

        WebElement element5 = driver.findElement(By.xpath("//html/body/div/div/form/div[5]/label"));
        System.out.print(element5.getText());

        WebElement adressElement = driver.findElement(By.id("address"));
        if (adressElement.isDisplayed()){
        adressElement.click();
        }
        adressElement.sendKeys("Zielona 21");
        System.out.println(": " + adressElement.getAttribute ("value"));

        WebElement element6 = driver.findElement(By.xpath("/html/body/div/div/form/div[6]/label"));
        System.out.print(element6.getText());

        WebElement emailElement = driver.findElement(By.id("email"));
        if (emailElement.isDisplayed()){
        emailElement.click();}
        emailElement.sendKeys("jankot@wp.pl");
        System.out.println(": " + emailElement.getAttribute ("value"));

        WebElement element7 = driver.findElement(By.xpath("/html/body/div/div/form/div[7]/label"));
        System.out.print(element7.getText());

        WebElement passwordElement = driver.findElement(By.id("password"));
        if (passwordElement.isDisplayed()){
        passwordElement.click();}
        passwordElement.sendKeys("1qaz2wsx");
        System.out.println(": " + passwordElement.getAttribute ("value"));

        WebElement element8 = driver.findElement(By.xpath("/html/body/div/div/form/div[8]/label"));
        System.out.print(element8.getText());

        WebElement companyElement = driver.findElement(By.id("company"));
        if (companyElement.isDisplayed()){
        companyElement.click();}
        companyElement.sendKeys("Testowa");
        System.out.println(": " + companyElement.getAttribute ("value"));


        WebElement element9 = driver.findElement(By.xpath("/html/body/div/div/form/div[9]/label"));
        System.out.print(element9.getText());

        Select roleSelect= new Select(driver.findElement(By.id("role")));
        roleSelect.selectByVisibleText("Manager");
        List<WebElement> wel=roleSelect.getAllSelectedOptions();
        for (WebElement w: wel){
            System.out.println (": "+ w.getText());
        }

        WebElement element10 = driver.findElement(By.xpath("/html/body/div/div/form/div[10]/label"));
        System.out.print(element10.getText());

        Select jobexpSelect= new Select(driver.findElement(By.id("expectation")));
        jobexpSelect.selectByVisibleText("Challenging");
        List<WebElement> je =jobexpSelect.getAllSelectedOptions();
        for (WebElement j: je){
            System.out.println (": "+ j.getText());
        }

        WebElement element11 = driver.findElement(By.xpath("//html/body/div/div/form/div[11]/label"));
        System.out.print(element11.getText() + ": ");

        //checkbox
        List<WebElement> checkboxElements = driver.findElements(By.xpath("//div//label//input"));
        if (checkboxElements.get(5).isDisplayed()) {
            checkboxElements.get(5).click();
        }

        WebElement developmentWays= driver.findElement((By.xpath("/html/body/div/div/form/div[11]/div")));
        List<WebElement> checkbox2Elements = developmentWays.findElements(By.xpath(".//input"));
        /*checkboxElements.get(0).click();
        checkboxElements.get(1).click();*/

        for (WebElement j : checkbox2Elements){
            if (j.isSelected()){

                WebElement checkboxLabel = j.findElement(By.xpath("./.."));
                System.out.println(checkboxLabel.getText());
            }
        }

        WebElement element12 = driver.findElement(By.xpath("//html/body/div/div/form/div[12]/label"));
        System.out.print(element12.getText());

        WebElement commentTextArea= driver.findElement(By.id("comment"));
        if (commentTextArea.isDisplayed()){
        commentTextArea.sendKeys("zzzzzzzzzzzzzzzzzzzzzz");}
        System.out.println(": " + commentTextArea.getAttribute ("value"));

        WebElement submitButton= driver.findElement(By.id("submit"));
        submitButton.click();


    }
}
