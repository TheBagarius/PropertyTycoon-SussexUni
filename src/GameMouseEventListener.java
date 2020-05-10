import java.awt.event.MouseEvent;

public interface GameMouseEventListener {

    void mouseDragged(MouseEvent e);
    void mouseMoved(MouseEvent e);
    void mouseClicked(MouseEvent e);
    void mouseEntered(MouseEvent e);
    void mouseExited(MouseEvent e);
    void mousePressed(MouseEvent e);
    void mouseReleased(MouseEvent e);

}