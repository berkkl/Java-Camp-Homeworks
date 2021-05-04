import jdk.jshell.execution.Util;

public class Main {

    public static void main(String[] args) {

        UserManager userManager = new UserManager();
        DiscountManager discountManager = new DiscountManager();
        GameManager gameManager = new GameManager();
        ExtensionManager extensionManager = new ExtensionManager();


        User berk = new User();
        berk.setId(1);
        berk.setFirstName("Berk");
        berk.setLastName("Kalelioglu");
        berk.setUserName("berkkl");
        berk.setBirthDate("13/08/1998");
        berk.setTcNo("11111111111");

        User can = new User();
        can.setId(2);
        can.setFirstName("Can Deniz");
        can.setLastName("Acilioglu");
        can.setUserName("canoks");
        can.setBirthDate("13/12/1997");
        can.setTcNo("22222222222");

        Discount newYear = new Discount();
        newYear.setCampaignName("New Year");
        newYear.setDiscountId(1);
        newYear.setDiscountRate(30);

        Game ageOfEmpires2 = new Game();
        ageOfEmpires2.setGameId(1);
        ageOfEmpires2.setGameName("Age of Empires II");
        ageOfEmpires2.setGamePrice(100);

        Extension ageOfEmpires2Remastered = new Extension();
        ageOfEmpires2Remastered.setDlcId(1);
        ageOfEmpires2Remastered.setDlcName("Remastered");
        ageOfEmpires2Remastered.setDlcPrice(49);

        Utils.checkEdevlet(berk);
        userManager.login(berk, ageOfEmpires2);
        discountManager.add(newYear, ageOfEmpires2);
        gameManager.add(ageOfEmpires2);
        userManager.buyGame(can, ageOfEmpires2, newYear);
        extensionManager.addDlc(ageOfEmpires2Remastered, ageOfEmpires2);

    }
}
