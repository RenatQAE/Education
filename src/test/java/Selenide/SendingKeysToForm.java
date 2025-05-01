package Selenide;
import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class SendingKeysToForm {
    public String URL = "https://maxima.school";
    @Test
    public void SelenideDemo(){
        // открыть страницу 'maxima'
        open(URL);
        // проверить что страница открылась
        $("[class=button]").shouldBe(Condition.visible);
        // ввести 'текст поиска в поле поиска
        $("[id=_fullName]").setValue("Renat");
        $("[name=email]").setValue("Elfen_9@mail.ru");
        $("[name=telegram]").setValue("@Renatkzn16");
        $("[name=phoneNumber]").setValue("999999");
        $("[id=checkbox_undefined]").click();
        $("[id=checkbox_undefined]").shouldBe(Condition.enabled);
        }
}
