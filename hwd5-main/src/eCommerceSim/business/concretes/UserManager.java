package eCommerceSim.business.concretes;

import eCommerceSim.business.abstracts.UserService;
import eCommerceSim.dataAccess.abstracts.UserDao;
import eCommerceSim.entities.concretes.User;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserManager implements UserService {

    private UserDao userDao;

    public UserManager(UserDao userDao) {
        super();
        this.userDao = userDao;
    }

    @Override
    public void register(User user) {
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$"; //reference: https://howtodoinjava.com/java/regex/java-regex-validate-email-address/
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(user.getMail());

        /*if(userDao.getByPassword((user.getPassword()))!=null){
            System.out.println("6 haneden uzun bir sifre giriniz!");

        */
        if (user.getPassword().length() < 6) {
            System.out.println("Sayin " + user.getFirstName() + " " + user.getLastName() + " 6 haneden uzun bir sifre giriniz.");
        } else if (!matcher.matches()) {
            System.out.println("Sayin " + user.getFirstName() + " " + user.getLastName() + " mail formati yanlis.");
        } else if (userDao.getByMail(user.getMail()) != null) {
            System.out.println("Sayin " + user.getFirstName() + " " + user.getLastName() + " bu mail adresi sistemde mevcut.");
        } else if (user.getFirstName().length() < 2 || user.getLastName().length() < 2) {
            System.out.println(" Ad ve soy ad en az ikişer haneden olusmalidir.");
        } else if (userDao.getNameCheck(user.getFirstName(), user.getLastName())!=null){
            System.out.println("Lutfen Ad ve Soyadinizi giriniz");
        } else {
            userDao.register(user);
            System.out.println(user.getFirstName() + " " + user.getLastName() + " adli kullanici kaydoldu.");
            System.out.println(user.getMail() + "adresine kayıt onay postası gönderildi, hesabinizi onayladiktan sonra giris yapabilirsiniz");

        }

    }

    @Override
    public void login(User user) {
        userDao.login(user);

    }

    @Override
    public void deleteUser(User user) {
        userDao.deleteUser(user);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    public User getId(int id) {
        return null;
    }

    @Override
    public User getMail(String mail) {
        return null;
    }

    @Override
    public User getPassword(String password) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
