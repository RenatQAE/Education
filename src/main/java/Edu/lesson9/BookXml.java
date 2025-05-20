package Edu.lesson9;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.nio.file.Path;
import java.util.List;

public class BookXml {
    public static void main(String[] args) throws JAXBException, JAXBException {

        Path filePath = Path.of("books.xml");

        BookC book1 = new BookC("12 стульев", 1927, "И.Ильф, Е.Петров");
        BookC book2 = new BookC("13 стульев", 1927, "И.Ильф, Е.Петров");
        BookC book3 = new BookC("14 стульев", 1927, "И.Ильф, Е.Петров");

        List<BookC> bookList = List.of(book1, book2, book3);

        JAXBContext context = JAXBContext.newInstance(BookC.class, Books.class);

        // Obj -> xml

        Books books = new Books(bookList);

        Marshaller marshaller = context.createMarshaller();
        marshaller.marshal(books, filePath.toFile());

        // XML -> Obj
//        Unmarshaller unmarshaller = context.createUnmarshaller();
//        Book unmarshal = (Book) unmarshaller.unmarshal(filePath.toFile());

    }
}
