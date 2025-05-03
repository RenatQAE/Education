package Selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SendingKeysBySelenium {

    private WebDriver driver;
    public String URL = "https://dev.maxima.school/";
    @BeforeEach
    public void setUp(){
        driver = new ChromeDriver();
    }
    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void iCanSendKeysToForm(){
        driver.get(URL);
        String txt = "Hello";
        // //*[@id="_fullName"]
        WebElement inputName = driver.findElement(By.xpath("//*[@id='_fullName']"));
        inputName.click();
        inputName.sendKeys("Hello");
        inputName.sendKeys(Keys.TAB);
        inputName.click();
        assertEquals(txt,inputName.getAttribute("value"));

    }
}
