package core.domain;

import java.util.Date;

public class Book {
    private String isbn;
    private String name;
    private String author;
    private String publisher;
    private Date publishedAt;
    private int totalPage;

    public  Book(String isbn, String name, String author, String publisher, Date publishedAt, int totalPage) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.publishedAt = publishedAt;
        this.totalPage = totalPage;
    }

}
