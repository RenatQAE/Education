package Selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OpenUrlForTestBySelenium {
    private WebDriver driver;
    public String URL = "https://dev.maxima.school/";
    @BeforeEach
    public void setUp(){
        driver = new ChromeDriver();
    }
    @AfterEach
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void iCanOpenUrl(){
        driver.get(URL);
        String expectedResult = URL;
        String actualResult = driver.getCurrentUrl();
        assertEquals(expectedResult,actualResult);
    }
}
