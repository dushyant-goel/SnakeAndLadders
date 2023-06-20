package dice;

import java.util.Random;

public class Dice {
    Integer id;
    
    public Dice(Integer id) {
        this.id = id;
    }

    public Integer roll() {
        Random random = new Random();
        Integer face = random.nextInt(6) + 1;
        return face;
    }
}
