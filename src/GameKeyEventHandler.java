/**
 * This is a component of the Simple Game Engine written for the AP Computer Science A
 * course at the Woodstock School, Mussoorie, Uttarakhand, India.
 *
 * The GameKeyEventHandler represents the aggregator of game key listeners. It handles
 * collecting and processing of key events sent to the main game canvas.
 *
 * @author Jeffrey Santos
 * @version 1.0
 */

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class GameKeyEventHandler extends KeyAdapter {
    private ArrayList<GameKeyEventListener> gameKeyListeners;

    /**
     * Constructor for setting up default values.
     */
    public GameKeyEventHandler() {
        gameKeyListeners = new ArrayList<GameKeyEventListener>();
    }

    /**
     * Registers a key listener to the game key event handler.
     *
     * @param gameKeyListener The object to register as a key listener.
     */
    public void registerKeyListener(GameKeyEventListener gameKeyListener) {
        gameKeyListeners.add(gameKeyListener);
    }

    /**
     * Removes a key listener from the game key event handler.
     *
     * @param gameKeyListener The object to remove from the key listener list.
     */
    public void removeKeyListener(GameKeyEventListener gameKeyListener) {
        gameKeyListeners.remove(gameKeyListener);
    }

    /**
     * Processes the pressing of a key.
     *
     * @param e The KeyEvent event object.
     */
    public void keyPressed(KeyEvent e) {
        for (GameKeyEventListener gameKeyListener : gameKeyListeners)
            gameKeyListener.keyPressed(e);
    }

    /**
     * Processes the releasing of a key.
     *
     * @param e The KeyEvent event object.
     */
    public void keyReleased(KeyEvent e) {
        for (GameKeyEventListener listener : gameKeyListeners)
            listener.keyReleased(e);
    }
}