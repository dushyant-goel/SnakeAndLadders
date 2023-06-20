package board;
public class Cell {
    
    Integer id;
    
    public void setJumpToCell(Cell jumpToCell) {
        this.jumpToCell = jumpToCell;
    }

    Cell jumpToCell;
    
    Cell(Integer id) {
        this.id = id;
        this.jumpToCell = null;
    }
    

}
