import java.awt.*;
import java.util.Random;

public class Dice extends GameObject {

    int first;
    int second;

    public int roll(){
        Random rand = new Random();
        int rolled = 1+rand.nextInt(6);
        return rolled;
    }

    @Override
    void gameUpdate(long counter) {

    }

    @Override
    void paint(Graphics g) {

    }
}
