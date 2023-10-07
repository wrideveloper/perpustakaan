package repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import core.domain.Book;
import usecase.exceptions.BookAlreadyExistsException;
import usecase.interfaces.IBookRepository;

public class BookRepository implements IBookRepository {
    private final List<Book> books = new ArrayList<Book>();

    public Book createBook(Book book) throws BookAlreadyExistsException {
        String isbn = book.getIsbn();
        Book existingBook = books.stream().filter(b -> b.getIsbn().equals(isbn)).findFirst().orElse(null);
        if (existingBook != null) throw new BookAlreadyExistsException(isbn);
        books.add(book);
        return book;
    }
    public List<Book> getBooks() {
        // PR
        return null;
    }
    public Book getUserById(String id) {
        // PR
        return null;
    }
}
