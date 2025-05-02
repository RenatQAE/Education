package Selenide.Webdriver;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.*;

public class OpenLabirintAndAddBooks {

    @BeforeAll
    public static void setUp(){
        Configuration.baseUrl = "https://www.labirint.ru";
        Configuration.browser = "firefox";
        //Configuration.headless = true;
    }

    @Test
    public void addBooks(){
        open("/");
        //Selenide очистка куки файлов
        clearBrowserCookies();
        // создаем экземплр класса куки и добавляем в него куку
        Cookie cookie = new Cookie("cookie_policy","1");
        // добавляем куки
        WebDriverRunner.getWebDriver().manage().addCookie(cookie);
        //обновляем страницу
        refresh();
        // поиск книг по искомому слову
        $("[id=search-field]").setValue("Java").submit();
        // у каждой находим кнопку в корзину
        ElementsCollection buttons = $$(".search-result .btn-tocart");
        // прокликиваем каждую кнопку "в корзину"
        for (int i = 0; i <5 ; i++) {
            buttons.get(i).click();
        }
        //ожидаем что в корзине будет количесто 5
        $(".b-header-b-personal-e-icon-count-m-cart")
                .shouldHave(Condition.text("5"))
                .click();
        $$(".main_order-container div.need-watch").shouldHave(size(5));


    }

}
