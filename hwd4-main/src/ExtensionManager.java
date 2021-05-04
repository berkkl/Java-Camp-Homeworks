public class ExtensionManager implements ExtensionInterface{

    @Override
    public void addDlc(Extension extension, Game game) {

        System.out.println(game.getGameName() + "-" +extension.getDlcName() + " is out now!");

    }

    @Override
    public void updateDlc(Extension extension) {

        System.out.println(extension.getDlcName() + "has updated!");

    }

    @Override
    public void buyDlc(Extension extension, Game game) {

        System.out.println(extension.getDlcName() + "is out now!");

    }
}
