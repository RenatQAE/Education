package Selenide.Webdriver;

import com.codeborne.selenide.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GetInfo {

    public String URL = "https://maxima.school";


    @BeforeAll
    public static void setUp(){
        // дефолт = Хром, но можно изменить на другой
        // "safari" , "chrome" / "firefox"
        Configuration.browser = "firefox";
        // запуск без открытия браузера
        Configuration.headless = true;
        Configuration.timeout = 16 * 1000L;
    }


    @Test
    public void getUrl() {
        open(URL);
        String url = WebDriverRunner.url();
        String source = WebDriverRunner.source();
        String title = WebDriverRunner.getWebDriver().getTitle();

        System.out.println(url);
        System.out.println(source);
        System.out.println(title);
    }
    @Test
    public void getText(){
        // нужен таймаут
        String textToBe ="Data loaded with AJAX get request.";
        open("http://uitestingplayground.com/ajax");
        $("#ajaxButton").click();
        $("#content").should(text(textToBe));
        // assertEquals(textToBe,content.getText());
    }
    @Test
    public void getTrs(){
        open("https:///sky-todo-list.herokuapp.com/");
        // поиск множества элементов
        ElementsCollection rows = $$("tr").shouldHave(size(1));

    }
}
