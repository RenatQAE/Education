package Selenide;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;


public class OpenURLForTest {
    public String URL = "https://maxima.school";

    @BeforeEach
    public void setUp(){
        // открыть страницу
        Selenide.open(URL);
    }

    @AfterEach
    public void tearDown(){
        Selenide.closeWebDriver();
    }

    @Test
    public void iCanOpenURL(){

        // проверить что страница открылась
        Selenide.$("[class=Header_brand__SSNwx]").shouldBe(Condition.visible);
        // Кликнуть на любой раздел
        Selenide.$("a[href*='https://maxima.life/company/']").click();
        // Проверить что загрузился другой раздел
        String expectedResult = "https://maxima.life/company";
        String actualResult = Selenide.webdriver().driver().url();
        assertEquals(expectedResult,actualResult);
    }
}
