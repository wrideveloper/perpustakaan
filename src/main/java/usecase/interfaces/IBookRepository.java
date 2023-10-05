package usecase.interfaces;

import core.domain.Book;
import core.domain.User;

import javax.management.relation.Role;
import java.util.Date;
import java.util.List;

public interface IBookRepository {
    public Book createBook(
           /* ... */
        String isbn,
        String name,
        String author,
        String publisher,
        Date publishedAt,
        int totalPage
    );
    public List<Book> getBooks();
    public Book getUserById(String id);
}
