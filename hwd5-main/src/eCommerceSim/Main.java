package eCommerceSim;

import eCommerceSim.business.abstracts.UserService;
import eCommerceSim.business.concretes.UserManager;
import eCommerceSim.core.GoogleSignUpManagerAdapter;
import eCommerceSim.dataAccess.concretes.HibernateUserDao;
import eCommerceSim.entities.concretes.User;

public class Main {

    public static void main(String[] args) {
        UserService userService = new UserManager(new HibernateUserDao(), new GoogleSignUpManagerAdapter());


        User berk = new User(1,"Berk", "Kalelioglu", "bk3@gmail.com","b12345",true);
        userService.register(berk);
        User mert = new User(2,"Mert", "Bas", "mb3gmail.com", "m12345",true);
        userService.register(mert);
        User sev = new User(3,"Sevket", "Ozkan", "so3@gmail.com","s12345",false);
        userService.register(sev);
        User engin = new User(4,"Engin","Demirog","ed3@gmail.com","12345",true);
        userService.register(engin);
        User kaan = new User();
        kaan.setId(5);
        kaan.setFirstName("Kaan");
        kaan.setMail("ka3@gmail.com");
        kaan.setPassword("k12345");
        userService.register(kaan);

        userService.login();
        userService.login();
    }
}

