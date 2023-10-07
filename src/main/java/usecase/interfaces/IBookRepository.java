package usecase.interfaces;

import core.domain.Book;
import usecase.exceptions.BookAlreadyExistsException;

import java.sql.Date;
import java.util.List;

public interface IBookRepository {
    public Book createBook(
        String isbn,
        String name,
        String author,
        String publisher,
        Date publishedAt,
        int totalPage
    ) throws BookAlreadyExistsException;
    public List<Book> getBooks();
    public Book getUserById(String id);
}
