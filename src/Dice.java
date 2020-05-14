import java.awt.*;
import java.util.Random;

public class Dice extends GameObject {

    int roll;

    public Dice() {
        x = 650;
        y = 700;
    }

    public int roll(){
        Random rand = new Random();
        int rolled = 1+rand.nextInt(6);
        rolled += 1+rand.nextInt(6);
        roll = rolled;
        return rolled;
    }

    @Override
    void gameUpdate(long counter) {

    }

    @Override
    void paint(Graphics g) {
        g.setColor( Color.WHITE );

        g.setFont( new Font("TimesRoman", Font.PLAIN, 50) );
        g.drawString( "Dice Rolled",x,y+60  );

        g.setFont( new Font("TimesRoman", Font.PLAIN, 120) );
        g.drawString( String.valueOf( roll ),x,y  );

    }
}
