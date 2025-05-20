package Edu.lesson9;
import jakarta.xml.bind.annotation.*;
import java.util.List;
import java.util.Objects;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Books {
    @XmlElementWrapper(name = "books")
    @XmlElement(name = "book")
    private List<BookC> bookList;

    public Books() {
    }

    public Books(List<BookC> books) {
        this.bookList = books;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Books books)) return false;
        return Objects.equals(bookList, books.bookList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookList);
    }

    @Override
    public String toString() {
        return "Books{" +
                "bookList=" + bookList +
                '}';
    }
}
