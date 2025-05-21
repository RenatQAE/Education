package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.sql.Time;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MaximaSchoolTest {

    private WebDriver driver;

    @BeforeEach
    public void setUp(){
        // установка драйвера хром
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximazed");
        driver = new ChromeDriver(options);
    }
    @AfterEach
    public void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }

    @Test
    public void testClickOnKidsSection(){
        //открытие главной страницы
        driver.get("https://maxima.school/");
        // поиск раздела kids по xpath
        WebElement kidsSection = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/div[1]/header/nav/ul/li[7]/a"));
        // клик по элементу
        kidsSection.click();
        driver.navigate().refresh();

        String testURl = "https://maxima.school/kids";
        // проверка что раздел Kids открылся
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        currentUrl.equals(testURl);

    }
}
