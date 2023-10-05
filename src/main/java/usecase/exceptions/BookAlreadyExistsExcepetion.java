package usecase.exceptions;

public class BookAlreadyExistsExcepetion extends Exception {
    public BookAlreadyExistsExcepetion(String isbn) {
        super("Book with ISBN " + isbn + " already exists");
    }
    
}