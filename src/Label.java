import java.awt.*;

public class Label extends GameObject {

    String labeltxt;
    int fontSize;

    public Label(String labeltxt, int x, int y, int fontSize){
        this.x = x;
        this.y = y;
        this.labeltxt = labeltxt;
        this.fontSize = fontSize;
    }

    @Override
    void gameUpdate(long counter) {
    }

    @Override
    void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
        g.drawString(labeltxt,x,y);
    }
}
