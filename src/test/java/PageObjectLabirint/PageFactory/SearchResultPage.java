package PageObjectLabirint.PageFactory;

import PageObjectLabirint.Elements.BookCard;
import PageObjectLabirint.Elements.HeaderElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.ArrayList;
import java.util.List;

public class SearchResultPage {

    public final HeaderElement header;
    @FindBy(css = ".search-error h1")
    private WebElement searchErrorText;
    @FindBy(css = ".product-card")
    private List<WebElement> books;

    public SearchResultPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.header = new HeaderElement(driver);
    }

    public String getErrorText() {
        return searchErrorText.getText();
    }

    public void addBooksToCart(int count) {
        List<BookCard> bookCards = getBooks();
        for (int i = 0; i < count; i++) {
            bookCards.get(i).addToCart();
        }
    }

    public List<BookCard> getBooks() {
        List<BookCard> result = new ArrayList<>();

        books.forEach(e -> result.add(new BookCard(e)));

        return result; // 60
    }
}