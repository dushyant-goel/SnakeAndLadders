import game.Game;
import game.GameStatus;

public class App {
    public static void main(String[] args) throws Exception {

        Game game = new Game(5, 10, 2, 10);

        while(game.getStatus() != GameStatus.ENDED) {
            game.takeTurn();
        }
    }
}
