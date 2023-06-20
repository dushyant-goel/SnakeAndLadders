package board;
public class Cell {
    
    Integer pos;
    Cell jumpToCell;
    
    Cell(Integer id) {
        this.pos = id;
        this.jumpToCell = null;
    }
    
    public Boolean hasJump() {
        return this.jumpToCell != null;
    }
    
    public void setJumpToCell(Cell jumpToCell) {
        this.jumpToCell = jumpToCell;
    }
    
    public Cell getJumpToCell() {
        return jumpToCell;
    }
    
    public Integer getPos() {
        return this.pos;
    }

}
