package repository;

import core.domain.Book;
import usecase.interfaces.IBookRepository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


public class BookRepository implements IBookRepository {
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    private final List<Book> books = new ArrayList<Book>();
    public BookRepository() throws ParseException {
        books.add(new Book("123","Buku 1","Musashi","PT. Berkah",dateFormat.parse("2020-03-03"),200));
        books.add(new Book("124","Buku 2","Albert","PT. Berkah",dateFormat.parse("2020-03-03"),230));
    }
    public Book createBook() {
        // PR
        return null;
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
