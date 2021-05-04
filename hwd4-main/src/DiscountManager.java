public class DiscountManager implements DiscountInterface {

    public void add(Discount discount, Game game) {
        System.out.println(discount.getCampaignName() + " Sale is started with %" + discount.getDiscountRate() + " discounts!");
    }

    public void remove(Discount discount, Game game) {
        System.out.println(discount.getCampaignName() + " sale has ended!");
    }

    public void applyToGame(Discount discount, Game game) {
        System.out.println(discount.getCampaignName() + " has been added to the game " + game.getGameName());
    }

}
