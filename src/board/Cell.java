package board;
public class Cell {
    
    Integer id;
    Boolean hasJump; 
    Cell to;
    
    Cell(Integer id) {
        this.id = id;
        this.hasJump = false;
        this.to = null;
    }
    
    public void setHasJump(Boolean hasJump) {
        this.hasJump = hasJump;
    }

    public Boolean getHasJump() {
        return hasJump;
    }

    public Cell getTo() {
        return to;
    }

    public void setTo(Cell to) {
        this.to = to;
    }
    
}
