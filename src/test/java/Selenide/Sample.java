package Selenide;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Sample {
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
    public void iCanDoSomething(){

    }
}
