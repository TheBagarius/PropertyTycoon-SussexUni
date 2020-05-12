import java.awt.*;
import java.awt.event.MouseEvent;

public class SelectPlayersScreenButton extends Button{


    public SelectPlayersScreenButton(String dispName, int x, int y, int w, int h){
        super(dispName,x,y,w,h);
    }

    @Override
    void gameUpdate(long counter) {
    }

    @Override
    void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.drawRect(x,y,w,h);
        g.fillRect(x,y,w,h);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 20));
        g.setColor(Color.black);
        g.drawString(dispName, dispName == "Back" ? x + (w / 2) : x + 2, y + (h / 2));

    }


    @Override
    public void mouseClicked(MouseEvent e) {
        if(isMouseOver(e.getPoint())) {
            switch (dispName){
                case "Back" :
                    Main main = Main.getInstance();
                    main.startScreen();
                    break;
                default:
                    System.out.println(dispName);
            }
        }
    }


}
