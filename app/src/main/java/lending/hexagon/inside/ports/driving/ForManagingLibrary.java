package lending.hexagon.inside.ports.driving;

import java.util.List;

import lending.hexagon.inside.domain.Book;
import lending.hexagon.inside.domain.Loan;

public interface ForManagingLibrary {
    Loan borrowBook(int memberId, String isbn);
    void returnBook(int loanId);
    List<Book> listAvailableBooks();
}
