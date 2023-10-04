package usecase.interfaces;

import core.domain.User;

import javax.management.relation.Role;
import java.util.Date;
import java.util.List;

public interface IUserRepository {
    public User createUser(
            String nik,
            String username,
            String password,
            String fullName,
            Role role,
            Date birthDate,
            String birthPlace,
            String address,
            String email,
            String phoneNumber
    );
    public List<User> getUsers();
    public User getUserById(String id);
    public User getUserByUsername(String username);
}
