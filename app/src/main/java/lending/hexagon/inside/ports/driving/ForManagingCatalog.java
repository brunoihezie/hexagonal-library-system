package lending.hexagon.inside.ports.driving;

import java.util.List;
import lending.hexagon.inside.domain.Book;

public interface ForManagingCatalog {
    void addBook(String isbn, String title, int totalCopies);
    List<Book> listAllBooks();
}
