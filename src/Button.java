import java.awt.*;
import java.awt.event.MouseEvent;

public class Button extends GameObject implements GameMouseEventListener{

    String dispName;

    public Button(String dispName, int x, int y, int w, int h){
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.dispName = dispName;
    }

    @Override
    void gameUpdate(long counter) {

    }

    @Override
    void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.drawRect(x,y,w,h);
        g.fillRect(x,y,w,h);
        g.setColor(Color.black);
        g.drawString(dispName, x + (w / 2), y + (h / 2));

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(isMouseOver(e.getPoint())) {
            switch (dispName){
                case "Start Game" :
                    System.out.println("Hello");
                    break;
                case "Rules" :
                    System.out.println("Not yet Implemented");
                    break;
                case "Settings" :
                    System.out.println("Not yet Implemented again");
                    break;
                case "Exit" :
                    System.exit(0);
                    break;

            }
        }
    }

    private boolean isMouseOver(Point mouse) {
        if (( mouse.getX() >= x && mouse.getX() <= x + w )   // check if X is within range
            && ( mouse.getY() >= y && mouse.getY() <= y + h)) // check if y is within range
                return true;
        return false;
    }

    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }
}
