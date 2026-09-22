package lending.hexagon.inside.ports.driven;

import java.util.List;
import lending.hexagon.inside.domain.Book;

public interface ForObtainingBooks {
    void save(Book book);
    Book findByIsbn(String isbn);
    List<Book> findAll();

}
