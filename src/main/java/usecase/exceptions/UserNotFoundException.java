package usecase.exceptions;

public class UserNotFoundException extends Exception {
    public UserNotFoundException(String username) {
        super("User with the username of " + username + " doesn't exist");
    }
}
