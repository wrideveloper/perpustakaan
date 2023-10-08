package usecase.exceptions;

public class BookAlreadyExistsException extends Exception {
    public BookAlreadyExistsException(String isbn) {
        super("Book with ISBN " + isbn + " already exists");
    }
    
}