package lending.hexagon.inside.domain;

import java.util.List;

public class Member {
    private int memberId;
    private String name;
    private List<Loan> loans;

    public Member(int memberId, String name, List<Loan> loans) {
        this.memberId = memberId;
        this.name = name;
        this.loans = loans;
    }

    // Getters and setters
    public int getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Loan> getLoans() {
        return loans;
    }

    public void addLoan(Loan loan) {
        this.loans.add(loan);
    }
}

