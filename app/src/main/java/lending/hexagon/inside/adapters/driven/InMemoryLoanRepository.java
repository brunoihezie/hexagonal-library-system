package lending.hexagon.inside.adapters.driven;

import java.util.ArrayList;
import java.util.List;

import lending.hexagon.inside.domain.Loan;
import lending.hexagon.inside.ports.driven.ForGeneratingLoanIds;
import lending.hexagon.inside.ports.driven.ForObtainingLoans;

public class InMemoryLoanRepository implements ForObtainingLoans {
    private final List<Loan> loans;
    private final ForGeneratingLoanIds loanIdGenerator;

    public InMemoryLoanRepository(ForGeneratingLoanIds loanIdGenerator) {
        this.loans = new ArrayList<>();
        this.loanIdGenerator = loanIdGenerator;
    }

    @Override
    public void save(Loan loan) {
        loans.add(loan);
    }

    @Override
    public Loan findById(int loanId) {
        if (loanId <= 0) {
            throw new IllegalArgumentException("Loan ID must be greater than 0");
        } else if(loans.isEmpty() || loans == null) {
            throw new IllegalStateException("No loans found in the repository");
        }

        for (Loan loan : loans) {
            if (loan.getLoanId() == loanId) {
                return loan;
            }
        }
        return null;
    }

    @Override
    public int nextId() {
        return loanIdGenerator.nextId();
    }
    
}
