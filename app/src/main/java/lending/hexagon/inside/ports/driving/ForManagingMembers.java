package lending.hexagon.inside.ports.driving;

import lending.hexagon.inside.domain.Loan;

public interface ForManagingMembers {
    int activeLoanCount(int memberId);
    Boolean canBorrow(int maxActiveLoans, int memberId);
    void addLoanToMember(int memberId, Loan loan);
    int registerMember(String name);
}