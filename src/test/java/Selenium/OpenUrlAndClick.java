package Selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Time;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OpenUrlAndClick {
    private WebDriver driver;
    public String URL = "https://dev.maxima.school/";
    @BeforeEach
    public void setUp(){
        driver = new ChromeDriver();
    }
    @AfterEach
    public void tearDown() {
        if (driver != null){
        driver.quit();
    }
    }

    @Test
    public void iCanOpenUrl() {
        driver.get(URL);

        String expectedResult = "https://maxima.life/products";
        WebElement element = driver.findElement(By.linkText("Продукты"));
        System.out.println(element.getText());
        element.click();

        assertEquals(expectedResult,driver.getCurrentUrl());
    }
}

