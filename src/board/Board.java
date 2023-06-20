package board;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;


public class Board {
    public List<Cell> cells;
    private Integer edgeSize;
    
    public Board(Integer edgeSize, Integer numSnakesLadders) {
        this.cells = new ArrayList<>();
        this.edgeSize = edgeSize;
        
        Integer maxCell = edgeSize*edgeSize;
        
        for(Integer i = 1; i <= maxCell; i++) {
            cells.add(new Cell(i));
        }
        
        Random rand = new Random();
        for(Integer i = 0; i < numSnakesLadders; ) {
            int from = rand.nextInt(maxCell - 1) + 1;
            int to = rand.nextInt(maxCell - 1) + 1;
            
            
            if(from != to) {
                
                if(from < to)
                    System.out.println("ladder> " + from + ":" + to);
                else
                    System.out.println("snake> " + from + ":" + to);
                
                Cell jumpFrom = cells.get(from-1);
                Cell jumpTo = cells.get(to-1);
                
               jumpFrom.setJumpToCell(jumpTo);
                
                i++;
            }
        }
    }
    
    public Integer getEdgeSize() {
        return edgeSize;
    }

    public Cell getCell(int position) {
        return cells.get(position-1);
    }
}
