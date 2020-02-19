/**
 * This is a component of the Simple Game Engine written for the AP Computer Science A
 * course at the Woodstock School, Mussoorie, Uttarakhand, India.
 * 
 * The GameCanvas represents the main area of the game window where component objects
 * are drawn on screen.
 * 
 * @author Jeffrey Santos
 * @version 1.0
 */

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class GameCanvas extends JPanel {
	/**
	 * Constructor for setting up default values inherited from JPanel.
	 */
	public GameCanvas() {
		setFocusable(true);
		setDoubleBuffered(true);
	}
	
	/**
	 * This method cycles through all current game objects and asks them to paint themselves.
	 * 
	 * @param g The Graphics object generated for handling basic drawing commands.
	 */
	public void paint(Graphics g) {
		super.paint(g);	
		for (GameObject gameObject : GameController.getInstance().getGameObjects())
			gameObject.paint(g);
	}
}
