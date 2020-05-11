/**
 * This is a component of the Simple Game Engine written for the AP Computer Science A
 * course at the Woodstock School, Mussoorie, Uttarakhand, India.
 *
 * The GameObject abstract class provides a template for generating component objects
 * for the game.
 *
 * @author Jeffrey Santos
 * @version 1.0
 */
import java.awt.Graphics;

abstract class GameObject {
    protected int x, y, w, h;

    /**
     * Method that is automatically run every game round (5ms).
     *
     * @param counter The current game counter value.
     */
    abstract void gameUpdate(long counter);

    /**
     * Method for describing how a game object should be drawn on screen.
     *
     * @param g The Graphics object for the game canvas.
     */
    abstract void paint(Graphics g);
}