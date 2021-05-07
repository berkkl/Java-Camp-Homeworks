package eCommerceSim.business.concretes;

import eCommerceSim.business.abstracts.UserService;
import eCommerceSim.core.AuthService;
import eCommerceSim.dataAccess.abstracts.UserDao;
import eCommerceSim.entities.concretes.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserManager implements UserService {
    private List<User> users = new ArrayList<User>();

    private UserDao userDao;
    private AuthService authService;

    public UserManager(UserDao userDao, AuthService authService) {
        super();
        this.userDao = userDao;
        this.authService = authService;
    }

    @Override
    public void register(User user) {


        String regex = "^[A-Za-z0-9+_.-]+@(.+)$"; //reference: https://howtodoinjava.com/java/regex/java-regex-validate-email-address/
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(user.getMail());

        /*if(userDao.getByPassword((user.getPassword()))!=null){
            System.out.println("6 haneden uzun bir sifre giriniz!");

        */
        if (user.getFirstName() == null || user.getLastName() == null || user.getMail() == null || user.getPassword() == null) {
            System.out.println("Lutfen ad, soyad, mail ve sifre bilgilerinizi eksiksiz giriniz");
            System.out.println("************************************************************************************");

        } else if (user.getPassword().length() < 6) {
            System.out.println("Sayin " + user.getFirstName() + " " + user.getLastName() + " 6 haneden uzun bir sifre giriniz.");
            System.out.println("************************************************************************************");
        } else if (!matcher.matches()) {
            System.out.println("Sayin " + user.getFirstName() + " " + user.getLastName() + " mail formati yanlis.");
            System.out.println("************************************************************************************");
        } else if (userDao.getByMail(user.getMail()) != null) {
            System.out.println("Sayin " + user.getFirstName() + " " + user.getLastName() + " bu mail adresi sistemde mevcut.");
            System.out.println("************************************************************************************");
        } else if (user.getFirstName().length() < 2 || user.getLastName().length() < 2) {
            System.out.println(" Ad ve soy ad en az ikişer haneden olusmalidir.");
            System.out.println("************************************************************************************");
        } else {
            this.userDao.register(user);
            Random rd = new Random(); // creating Random object
            if(rd.nextBoolean() == true){
                this.authService.authenticate(user.getFirstName()+" "+user.getLastName()+" ");
            }
            System.out.println(user.getFirstName() + " " + user.getLastName() + " adli kullanici kaydoldu.");
            System.out.println(user.getMail() + "adresine kayıt onay postası gönderildi, hesabinizi onayladiktan sonra giris yapabilirsiniz");
            System.out.println("************************************************************************************");

        }

    }

    @Override
    public void login() {


        int flag = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter gmail:");
        String mail = scan.nextLine();
        System.out.println("Enter password:");
        String password = scan.nextLine();

        for (User user : userDao.getAll()) {

            if (user.getMail().equals(mail) && user.getPassword().equals(password))  {
                if (!user.isVerified()) {
                    System.out.println("Mailiniz dogrulanmamis, dogrulayip tekrar deneyin.");
                    flag=1;
                    break;
                }
                System.out.println(user.getFirstName() + " " + user.getLastName() + " sisteme giris yapti.");
                userDao.login(user);
                flag = 1;
                break;
            }

        }


        if (flag == 0) {
            System.out.println("mail ve ya sifreniz yanlis.");
        }
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
    public void mailVerification(User user) {
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
