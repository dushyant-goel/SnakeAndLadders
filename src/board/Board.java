package board;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;


public class Board {
    public List<Cell> cells;
    private Integer edgeSize;

    
    public Board(Integer edgeSize, Integer numberSnakesLadders) {
        this.cells = new ArrayList<>();
        this.edgeSize = edgeSize;
        
        Integer maxCell = edgeSize*edgeSize;
        
        for(Integer i = 1; i <= maxCell; i++) {
            cells.add(new Cell(i));
        }
        
        Random rand = new Random();
        for(Integer i = 0; i < numberSnakesLadders; ) {
            int from = rand.nextInt(maxCell) + 1;
            int to = rand.nextInt(maxCell) + 1;
            
            if(from != to) {
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
}
