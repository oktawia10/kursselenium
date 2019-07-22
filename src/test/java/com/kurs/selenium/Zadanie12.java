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

import static org.junit.Assert.assertEquals;


public class Zadanie12 {

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
    public void testErrorMessagesOnKatalonForm()
    {
        driver.findElement(By.id("submit")).click();

        List<WebElement>errorElements=driver.findElements(By.xpath("//label[@class='error']"));

                for(WebElement error:errorElements) {
                    String errorText = error.getText();
                    assertEquals("This field is required.", errorText);

                    String fieldAssigned=error.getAttribute("for");
                    System.out.println("Error text: "+errorText);
                    System.out.println("For input with id:"+fieldAssigned);
                }
}
}
