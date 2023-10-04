package core.domain;

import java.util.Date;

public class User {
    public enum Role {
        user,
        admin
    }

    private String id;
    private String nik;
    private String username;
    private String password;
    private String fullName;
    private Role role;
    private Date birthDate;
    private String birthPlace;
    private String address;
    private String email;
    private String phoneNumber;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Role getRole() {
        return role;
    }
}
