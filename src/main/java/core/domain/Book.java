package core.domain;

import java.time.LocalDate;
import java.util.Date;

public class Book {
    private String isbn;
    private String name;
    private String author;
    private String publisher;
    private LocalDate publishedAt;
    private int totalPage;

    public  Book(String isbn, String name, String author, String publisher, LocalDate localDate, int totalPage) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.publishedAt = localDate;
        this.totalPage = totalPage;
    }


}
