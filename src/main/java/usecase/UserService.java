package usecase;

import core.domain.User;
import repository.UserRepository;
import usecase.exceptions.InvalidPasswordException;
import usecase.exceptions.UserNotFoundException;
import usecase.interfaces.IUserRepository;

public class UserService {
    private final IUserRepository userRepository;
    private static User currentUser;

    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void login(String username, String password) throws UserNotFoundException, InvalidPasswordException {
        User user = userRepository.getUserByUsername(username);
        if (user == null) throw new UserNotFoundException(username);
        if (!user.getPassword().equals(password)) throw new InvalidPasswordException();
        currentUser = user;
    }

    public User getCurrentUser() {
        return currentUser;
    }
}
