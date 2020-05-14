import java.awt.*;

public class Card extends GameObject {

    String description;
    String Action;


    public Card(int x, String description) {
        this.x = x;
        this.description = description;
        y = 250;
        w = 300;
        h = 150;
    }

    @Override
    void gameUpdate(long counter) {

    }

    @Override
    void paint(Graphics g) {

        g.setColor( Color.WHITE );
        g.fillRect( x,y,w,h );

        g.setColor( Color.BLACK );
        g.setFont( new Font("TimesRoman", Font.PLAIN, 15) );
        g.drawString( description, x+10,y+(h/3) );

    }
}
