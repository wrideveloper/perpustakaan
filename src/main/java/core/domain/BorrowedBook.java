package core.domain;

import java.util.Date;

public class BorrowedBook {
    private String id;
    private User admin;
    private User user;
    private Book book;
    private Date dueDate;
    private Date returnedAt;
    private Date borrowedAt;
}
