public interface UserInterface {
    void login(User user, Game game);
    void register(User user, Game game);
    void logout(User user, Game game);
    void buyGame(User user, Game game, Discount discount);
}
