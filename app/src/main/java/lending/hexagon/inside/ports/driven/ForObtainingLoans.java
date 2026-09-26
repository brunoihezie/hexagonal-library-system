package lending.hexagon.inside.ports.driven;

import lending.hexagon.inside.domain.Loan;

public interface ForObtainingLoans {
    void save(Loan loan);
    Loan findById(int loanId);
    int nextId();
}
