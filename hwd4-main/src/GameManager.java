public class GameManager implements GameInterface{

    @Override
    public void add(Game game) {

        System.out.println(game.getGameName()+ " has been added to the store!");

    }

    @Override
    public void remove(Game game) {

        System.out.println(game.getGameName()+ " has removed from the store!");

    }

    @Override
    public void update(Game game) {

        System.out.println(game.getGameName()+ " is now up to date!");

    }
}



