/**
 * This is a component of the Simple Game Engine written for the AP Computer Science A
 * course at the Woodstock School, Mussoorie, Uttarakhand, India.
 *
 * The GameKeyEventListener interface is the required interface for any
 * object that is to be registered as a game key listener to the game key handler.
 *
 * @author Jeffrey Santos
 * @version 1.0
 */

import java.awt.event.KeyEvent;

public interface GameKeyEventListener {

    void keyPressed(KeyEvent e);
    void keyReleased(KeyEvent e);

}