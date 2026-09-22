package lending.hexagon.inside.domain;

import java.time.LocalDate;

public class Loan {
    private int loanId;
    private Member member;
    private Book book;
    private LocalDate borrowedAt;
    private LocalDate dueAt;
    private LocalDate returnedAt;

    public Loan(int loanId, Member member, Book book, LocalDate borrowedAt, LocalDate dueAt) {
        this.loanId = loanId;
        this.member = member;
        this.book = book;
        this.borrowedAt = borrowedAt;
        this.dueAt = dueAt;
        this.returnedAt = null; // Initially, the book is not returned
    }

    // Getters and setters
    public int getLoanId() {
        return loanId;
    }

    public Member getMember() {
        return member;
    }

    public Book getBook() {
        return book;
    }

    public LocalDate getBorrowedAt() {
        return borrowedAt;
    }

    public LocalDate getDueAt() {
        return dueAt;
    }

    public LocalDate getReturnedAt() {
        return returnedAt;
    }

    public void setReturnedAt(LocalDate returnedAt) {
        this.returnedAt = returnedAt;
    }

    @Override
    public String toString() {
        return "Loan ID: " + getLoanId() + ", due " + getDueAt();
    }
}
