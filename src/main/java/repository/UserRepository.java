package repository;

import core.domain.User;
import usecase.exceptions.UserNotFoundException;
import usecase.interfaces.IUserRepository;

import javax.management.relation.Role;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserRepository implements IUserRepository {
    private final List<User> users = new ArrayList<User>();
    public User createUser(String nik, String username, String password, String fullName, Role role, Date birthDate, String birthPlace, String address, String email, String phoneNumber) {
        // PR
        return null;
    }
    public List<User> getUsers() {
        // PR
        return null;
    }
    public User getUserById(String id) {
        // PR
        return null;
    }
    
    public User getUserByUsername(String username) throws UserNotFoundException {
        User user = users.stream().filter(u -> u.getUsername().equals(username)).findFirst().orElse(null);
        if (user == null) {
            throw new UserNotFoundException(username);
        }
        return user;
    }
}
