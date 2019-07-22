package com.kurs.selenium;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class Zadanie {
        private WebDriver driver;

        @Before
        public void setUp() {
            System.setProperty("webdriver.gecko.driver",
                    "src/test/resources/geckodriver");
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get("http://www.bing.com");
        }

        @Test
        public void testGoogleSearch() {
            WebElement element = driver.findElement(By.name("q"));
            element.clear();
            element.sendKeys("Mistrzostwa Świata w piłce nożnej 2018");
            element.submit();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            WebElement wyniki = driver.findElement(By.xpath("/html/body/div[2]/main/div/span[1]"));//b(y.classname ("sb_count"))
                    String wynik = wyniki.getText();
            Assert.assertEquals("1 920 000 Results", wynik);
        }

        @After
        public void tearDown() throws Exception {
            // driver.quit();
        }

    }

