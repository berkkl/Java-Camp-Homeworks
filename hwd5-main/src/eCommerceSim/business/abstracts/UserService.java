package eCommerceSim.business.abstracts;

import eCommerceSim.entities.concretes.User;

import java.util.List;

public interface UserService {
    void register(User user);
    void login();
    void deleteUser(User user);
    void updateUser(User user);
    void mailVerification(User user);
    User getId(int id);
    User getMail(String mail);
    User getPassword(String password);
    List<User> getAll();
}
