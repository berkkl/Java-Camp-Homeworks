package eCommerceSim.dataAccess.concretes;

import eCommerceSim.dataAccess.abstracts.UserDao;
import eCommerceSim.entities.concretes.User;
import java.util.ArrayList;
import java.util.List;


public class HibernateUserDao implements UserDao {

    List<User> users = new ArrayList<User>();

    /*
    private ArrayList<User> users;

    public HibernateUserDao(ArrayList<User> users) {
        this.users = users;
    }

    public HibernateUserDao() {
        super();
    }

 */

    @Override
    public void register(User user) {
        users.add(user);
    }

    @Override
    public void login(User user) {

    }

    @Override
    public void deleteUser(User user) {
        users.remove(user);
    }
    @Override
    public void updateUser(User user) {
    }

    @Override
    public User getById(int id) {
        for(User user: users){
            if(user.getId() == id){
                return user;
            }
        }
        return null;
    }

    @Override
    public User getByMail(String mail) {
        for(User user: users){
            if(user.getMail()==mail){
                return user;
            }
        }

        return null;
    }

    @Override
    public User getByPassword(String password) {
        for(User user: users){
            if(user.getPassword().length()<6){
                return user;
            }
        }
        return null;
    }


    @Override
    public ArrayList<User> getAll() {
        return (ArrayList<User>) users;
    }

}
