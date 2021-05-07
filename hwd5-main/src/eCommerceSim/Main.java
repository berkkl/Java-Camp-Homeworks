package eCommerceSim;

import eCommerceSim.business.abstracts.UserService;
import eCommerceSim.business.concretes.UserManager;
import eCommerceSim.dataAccess.abstracts.UserDao;
import eCommerceSim.dataAccess.concretes.HibernateUserDao;
import eCommerceSim.entities.concretes.User;

public class Main {

    public static void main(String[] args) {
        UserService userService = new UserManager(new HibernateUserDao());


        User berk = new User(1,"Berk", "Kalelioglu", "bk3@gmail.com","abcdef",true);
        userService.register(berk);
        User mert = new User(2,"Mert", "Basarir", "mb3@gmail.com", "mert135", true);
        userService.register(mert);
        User sev = new User(3,"Sevval", "Ozturk", "so3@gmail.com","5832523", true);
        userService.register(sev);
        User kaan = new User();
        kaan.setId(4);
        kaan.setFirstName("Kaan");
        kaan.setMail("ka3@gmail.com");
        kaan.setPassword("kaan5325");
        kaan.setVerified(true);
        userService.register(kaan);
    }
}


/*  ToDo: Kullanıcılar sisteme bilgilerini girerek üye olabilmelidir.

    Sisteme temel kullanıcı bilgileri , e-posta ve parolayla üye olunabilmelidir. Temel kullanıcı bilgileri : ad, soyad, e-posta, parola. Temel bilgilerin tamamı zorunludur.
    Parola en az 6 karakterden oluşmalıdır.
    E-posta alanı e-posta formatında olmalıdır. (Regex ile yapınız. Araştırma konusu)
    E-Posta daha önce kullanılmamış olmalıdır.
    Ad ve soyad en az iki karakterden oluşmalıdır.
    ToDo Üyelik sonucu kullanıcıya doğrulama e-postası gönderilmelidir. (Simulasyon)
    ToDo Doğrulama linki tıklandığında üyelik tamamlanmalıdır. (Simulasyon)
    ToDo Hatalı veya başarılı durumda kullanıcı bilgilendirilmelidir.

    ToDo Kullanıcılar sisteme Google hesapları ile üye olabilmelidir. (Simulasyon)

    ToDo İlerleyen zamanlarda başka yetkilendirme servisleri de kullanılabilir. (Sistemi dış servis entegrasyonu olacak şekilde yapılandırınız.)
    ToDo Hatalı veya başarılı durumda kullanıcı bilgilendirilmelidir.

    ToDo Kullanıcılar e-posta ve parola bilgisiyle sisteme giriş yapabilmelidir.

    ToDo E-posta ve parola zorunludur
    ToDo Hatalı veya başarılı durumda kullanıcı bilgilendirilmelidir.


 */
