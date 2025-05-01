package Selenide.Webdriver;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Demo {
    @Test
    public void userCanLoginByUsername() {
        // открываетсся страница
        open("https://habr.com/ru");
        // найти эллемент и задать в него данные
        $(By.name("user.name")).setValue("johny");
        // найти элемент и кликнуть на него
        $("#submit").click();
        // элемент лоадинг ОР: пропадает
        $(".loading_progress").should(disappear); // Само подождёт, пока элемент исчезнет
        // элемент имеется текст "Hello, Johny!"
        $("#username").shouldHave(text("Hello, Johny!")); // Само подождёт, пока у элемента появится нужный текст
    }

}
