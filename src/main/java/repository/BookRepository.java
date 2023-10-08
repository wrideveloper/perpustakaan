package repository;

import core.domain.Book;
import usecase.interfaces.IBookRepository;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class BookRepository implements IBookRepository {
    private final List<Book> books = new ArrayList<Book>();
    Date d1 = new Date(1999, 11, 21); 
    public BookRepository()   {
        books.add(new Book("123","Buku 1","Musashi","PT. Berkah",d1,200));
        books.add(new Book("124","Buku 2","Albert","PT. Berkah",d1,230));
    }
    public Book createBook(String isbn, String name, String author, String publisher, Date publishedAt, int totalPage) throws BookAlreadyExistsException {
        Book existingBook = books.stream().filter(book -> book.getIsbn().equals(isbn)).findFirst().orElse(null);
        if (existingBook != null) throw new BookAlreadyExistsException(isbn);
        Book book = new Book(isbn, name, author, publisher, publishedAt, totalPage);
        books.add(book);
        return book;
    }
    @Override
    public List<Book> getBooks(){
        return books;
    }
    public Book getUserById(String id) {
        // PR
        return null;
    }
}
