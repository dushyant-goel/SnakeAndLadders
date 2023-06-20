import java.util.Scanner;

import game.Game;
import game.GameStatus;

public class App {
    public static void main(String[] args) throws Exception {
        
        int numPlayers;
        int boardSize;
        int numDice;
        int numSnakesLadders;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of players (2-6) > ");
        numPlayers = scanner.nextInt();
        if(numPlayers < 2 || numPlayers > 6) {
            System.out.println("invalid input, setting to default, 2");
            numPlayers = 2;
        }

        System.out.println("Enter board size (6-15) > ");
        boardSize = scanner.nextInt();
        if(boardSize < 6 || boardSize > 15) {
            System.out.println("invalid input, setting to default, 10");
            boardSize = 10;
        }

        System.out.println("Enter number of dice (1-2) > ");
        numDice = scanner.nextInt();
        if(numDice < 1 || numDice > 2) {
            System.out.println("invalid input, setting to default, 2");
            numDice = 2;
        }

        numSnakesLadders = 10;

        Game game = new Game(numPlayers, boardSize, numDice, numSnakesLadders);
        while(game.getStatus() != GameStatus.ENDED) {
            game.takeTurn();
        }
    }
}
