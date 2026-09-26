package lending.hexagon.inside.ports.driving;

import java.time.LocalDate;

import lending.hexagon.inside.domain.Book;
import lending.hexagon.inside.domain.Loan;
import lending.hexagon.inside.domain.Member;

public interface ForProcessingLoans {
    Loan create(Member member, Book book);
    boolean isReturned(int loanId);
    void markAsReturned(LocalDate at, int loanId);
}
