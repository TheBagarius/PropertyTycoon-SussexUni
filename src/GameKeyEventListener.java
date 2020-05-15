/**
 * This is a component of the Simple Game Engine written by * <a href="https://github.com/jmscsedu">
 * Jeffery Santos</a> and made available * privately to those enrolled or have taken a course taught
 * by him.
 *
 * <p>The GameKeyEventListener interface is the required interface for any object that is to be
 * registered as a game key listener to the game key handler.
 *
 * @author Jeffrey Santos
 * @version 1.0
 */
import java.awt.event.KeyEvent;

public interface GameKeyEventListener {

  void keyPressed(KeyEvent e);

  void keyReleased(KeyEvent e);
}
