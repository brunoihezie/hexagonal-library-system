package lending.hexagon.inside.domain;

public class Book {
    private String isbn;
    private String title;
    private int totalCopies;
    private int availableCopies;

    public Book(String isbn, String title, int totalCopies, int availableCopies) {
        this.isbn = isbn;
        this.title = title;
        this.totalCopies = totalCopies;
        this.availableCopies = availableCopies;
    }

    // Getters and setters
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTotalCopies() {
        return totalCopies;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void setAvailableCopies(int availableCopies) {
        this.availableCopies = availableCopies;
    }

    @Override
    public String toString() {
        return String.format("- %s (ISBN: %s) — %d copies available%n",
                getTitle(), getIsbn(), getAvailableCopies());
    }
}

