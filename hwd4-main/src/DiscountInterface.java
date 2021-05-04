public interface DiscountInterface {
    void add(Discount discount, Game game);
    void remove(Discount discount, Game game);
    void applyToGame(Discount discount, Game game);

}
