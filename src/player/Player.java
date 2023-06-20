package player;

public class Player {
    Integer id;
    Integer pos;
    
    public void setPos(Integer pos) {
        this.pos = pos;
    }

    public Integer getPos() {
        return pos;
    }

    public Player(Integer id) {
        this.id = id;
        pos = 0;
    }

    
}
