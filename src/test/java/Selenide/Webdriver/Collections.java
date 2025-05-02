package Selenide.Webdriver;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static Selenide.Webdriver.HasChildCondition.hasChild;
import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class Collections {

    @Test
    public void test() {
        open("https://bonigarcia.dev/selenium-webdriver-java/dropdown-menu.html");
        SelenideElement button = $("#my-dropdown-1");

        button.click();

        ElementsCollection lis = button.sibling(0).findAll("li"); //ul li

        lis.shouldHave(size(5))
                .filter(hasChild("a"))
                .shouldHave(size(4));
    }
}