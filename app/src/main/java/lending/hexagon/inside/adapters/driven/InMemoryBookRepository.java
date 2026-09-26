package lending.hexagon.inside.adapters.driven;

import java.util.ArrayList;
import java.util.List;

import lending.hexagon.inside.domain.Book;
import lending.hexagon.inside.ports.driven.ForObtainingBooks;

public class InMemoryBookRepository implements ForObtainingBooks {
    private final List<Book> books;

    public InMemoryBookRepository() {
        this.books = new ArrayList<>();
    }
    
    // Implementation of the repository methods
    @Override
    public void save(Book book) {
        // Implementation for saving a book
        books.add(book); 

    }

    @Override
    public Book findByIsbn(String isbn) {
        // Implementation for finding a book by ISBN
        if (isbn == null || isbn.isEmpty()) {
            throw new IllegalArgumentException("ISBN cannot be null or empty");
        } else if(books.isEmpty()) {
            throw new IllegalStateException("No books found in the repository");
        }

        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    @Override
    public List<Book> findAll() {
        // Implementation for finding all books
        return books;
    }
}

