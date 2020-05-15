/**
 * This is the dice class for the Property Tycoon game.
 *
 * @author 198787
 * @version 1.0
 */

import java.awt.*;
import java.util.Random;

public class Dice extends GameObject {

    int roll;

    public Dice() {
        x = 650;
        y = 700;
    }

    /**
     * Rolls 2 dice and adds the result. Does them separately since the probablity of all numbers
     * occurring is not even.
     * @return
     */
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

    /**
     * Draw the dice roll on the screen
     * @param g The Graphics object for the game canvas.
     */
    @Override
    void paint(Graphics g) {
        g.setColor( Color.WHITE );

        g.setFont( new Font("TimesRoman", Font.PLAIN, 50) );
        g.drawString( "Dice Rolled",x,y+60  );

        g.setFont( new Font("TimesRoman", Font.PLAIN, 120) );
        g.drawString( String.valueOf( roll ),x,y  );

    }
}
