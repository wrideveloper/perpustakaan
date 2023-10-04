package repository;

import core.domain.User;
import usecase.interfaces.IUserRepository;

import javax.management.relation.Role;
import java.util.Date;
import java.util.List;

public class UserRepository implements IUserRepository {
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
    public User getUserByUsername(String username) {
        // PR
        return null;
    }
}
