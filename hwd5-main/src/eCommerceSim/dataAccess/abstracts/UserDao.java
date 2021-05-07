package eCommerceSim.dataAccess.abstracts;

import eCommerceSim.entities.concretes.User;

import java.lang.reflect.Array;
import java.util.List;

public interface UserDao {
    void register(User user);
    void login(User user);
    void deleteUser(User user);
    void updateUser(User user);
    User getById(int id);
    User getByMail(String mail);
    User getByPassword(String password);
    User getNameCheck(String firstName, String lastName);
    List<User> getAll();

}
