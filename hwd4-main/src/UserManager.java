public class UserManager implements UserInterface{
    @Override
    public void login(User user, Game game) {
        System.out.println(user.getUserName() +" has logged in to " + game.getGameName());
    }

    @Override
    public void logout(User user, Game game) {
        System.out.println(user.getUserName()+" has logged out from " + game.getGameName());
    }

    @Override
    public void buyGame(User user, Game game, Discount discount) {
        System.out.println(user.getFirstName()+" has bought " + game.getGameName() + " with %" + discount.getDiscountRate() + " discount!");
    }

    @Override
    public void register(User user, Game game) {
        System.out.println(user.getFirstName()+ " has signed up to the " +game.getGameName() + " with " + user.getUserName());
    }
}
