public class Game {
    private String gameName;
    private int gameId;
    private double gamePrice;

    public Game(){

    }

    public Game(String gameName, int gameId, double gamePrice){
        super();
        this.gameName = gameName;
        this.gameId = gameId;
        this.gamePrice = gamePrice;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public double getGamePrice() {
        return gamePrice;
    }

    public void setGamePrice(double gamePrice) {
        this.gamePrice = gamePrice;
    }
}
