package usecase.exceptions;

public class InvalidPasswordException extends Exception{
    public InvalidPasswordException() {
        super("Incorrect password!");
    }
}
