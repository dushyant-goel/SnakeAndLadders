package game;

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.LinkedList;

import board.Board;
import player.Player;
import dice.Dice;
import board.Cell;

public class Game {
    
    Board board;
    Deque<Player> players;
    List<Dice> dice;
    
    int maxCell;
    GameStatus status;

    Game(int numPlayers, int boardSize, int numDice, int numSnakesLadders) {
        
        this.maxCell = boardSize*boardSize;
        this.board = new Board(boardSize, numSnakesLadders);

        this.players = new LinkedList<>();
        for(int i = 1; i <= numPlayers; i++ ) {
            this.players.add(new Player(i));
        }

        this.dice = new ArrayList<>();
        for(int i = 1; i <= numDice; i++) {
            dice.add(new Dice(i));
        }

        this.status = GameStatus.ACTIVE;
    }

    public void takeTurn() {
        Player curPlayer = players.pollFirst();
        // List<Integer> faces = new ArrayList<>();

        Integer inc = 0;
        for(Dice die : dice) {
            inc += die.roll();
        }

        Integer toPos = curPlayer.getPos() + inc;
        Cell toCell = board.getCell(toPos);
        
        if(toCell.hasJump()) {
            toCell = toCell.getJumpToCell();
        }
        
        curPlayer.setPos(Math.min(maxCell, toPos));

        if(curPlayer.getPos() != this.maxCell) {
            players.add(curPlayer);
        }

        if(players.size() == 1) {
            this.status = GameStatus.ENDED;
        }
    }

    public GameStatus getStatus() {
        return status;
    }
}


