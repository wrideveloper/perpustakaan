package presentation;

import core.domain.User;
import core.interfaces.IPresenter;
import core.interfaces.IScanner;
import usecase.exceptions.InvalidPasswordException;
import usecase.exceptions.UserNotFoundException;
import usecase.UserService;

public class TuiPresenter implements IPresenter {
    private final IScanner scanner;
    private final UserService userService;

    public TuiPresenter(IScanner scanner, UserService userService) {
        this.scanner = scanner;
        this.userService = userService;
    }

    public void showLoginView() {
        System.out.println("TUI Login");
        String username = scanner.getNonEmptyString("Username: ", "Username can't be empty!");
        String password = scanner.getStringWithLength("Password: ", 8, Integer.MAX_VALUE, "Password must be at least 8 characters");
        try {
            userService.login(username, password);
            if (userService.getCurrentUser().getRole() == User.Role.admin) {
                System.out.println("Dashboard Admin");
            } else {
                System.out.println("Dashboard User");
            }
        } catch (UserNotFoundException | InvalidPasswordException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
