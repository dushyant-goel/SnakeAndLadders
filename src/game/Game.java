package game;

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.LinkedList;

import board.Board;
import player.Player;
import dice.Dice;

public class Game {
    
    Board board;
    Deque<Player> players;
    List<Dice> dice;

    Game(int numPlayers, int boardSize, int numDice, int numSnakesLadders) {
        this.board = new Board(boardSize, numSnakesLadders);

        this.players = new LinkedList<>();
        for(int i = 1; i <= numPlayers; i++ ) {
            this.players.add(new Player(i));
        }

        this.dice = new ArrayList<>();
        for(int i = 1; i <= numDice; i++) {
            dice.add(new Dice(i));
        }
    }
}
