package board;
public class Cell {
    
    Integer id;
    
    Cell jumpToCell;
    
    Cell(Integer id) {
        this.id = id;
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
    

}
