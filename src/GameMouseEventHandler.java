import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class GameMouseEventHandler implements MouseListener, MouseMotionListener {
    ArrayList<GameMouseEventListener> gameMouseListeners;

    public GameMouseEventHandler() {
        gameMouseListeners = new ArrayList<GameMouseEventListener>();
    }

    public void registerMouseListener(GameMouseEventListener gameMouseListener) {
        gameMouseListeners.add(gameMouseListener);
    }

    public void removeMouseListener(GameMouseEventListener gameMouseListener) {
        gameMouseListeners.remove(gameMouseListener);
    }

    public void mouseDragged(MouseEvent e) {
        for (GameMouseEventListener gameMouseListener : gameMouseListeners)
            gameMouseListener.mouseDragged(e);
    }

    public void mouseMoved(MouseEvent e) {
        for (GameMouseEventListener gameMouseListener : gameMouseListeners)
            gameMouseListener.mouseMoved(e);
    }

    public void mouseClicked(MouseEvent e) {
        for (GameMouseEventListener gameMouseListener : gameMouseListeners)
            gameMouseListener.mouseClicked(e);
    }

    public void mouseEntered(MouseEvent e) {
        for (GameMouseEventListener gameMouseListener : gameMouseListeners)
            gameMouseListener.mouseEntered(e);
    }

    public void mouseExited(MouseEvent e) {
        for (GameMouseEventListener gameMouseListener : gameMouseListeners)
            gameMouseListener.mouseExited(e);
    }

    public void mousePressed(MouseEvent e) {
        for (GameMouseEventListener gameMouseListener : gameMouseListeners)
            gameMouseListener.mousePressed(e);
    }

    public void mouseReleased(MouseEvent e) {
        for (GameMouseEventListener gameMouseListener : gameMouseListeners)
            gameMouseListener.mouseReleased(e);
    }

}