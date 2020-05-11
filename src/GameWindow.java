/**
 * This is a component of the Simple Game Engine written for the AP Computer Science A
 * course at the Woodstock School, Mussoorie, Uttarakhand, India.
 *
 * The GameWindow is responsible for drawing the game's window on screen. It also holds the GameCanvas,
 * which represents the internal drawing area for the game.
 *
 * @author Jeffrey Santos
 * @version 1.0
 */

import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;

public class GameWindow extends JFrame {
    GameCanvas gameCanvas;

    /**
     * Constructor for setting up default values and creating the game canvas.
     */
    public GameWindow() {
        gameCanvas = new GameCanvas();
        add(gameCanvas);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        gameCanvas.setBackground(Color.white);
    }


    /**
     * Adds a game key listener to the canvas. This is actually the event handler.
     *
     * @param keyListener The key event handler responsible for catching key presses.
     */
    public void addKeyListener(GameKeyEventHandler keyListener) {
        gameCanvas.addKeyListener(keyListener);
    }

    /**
     * Adds a game mouse listener to the canvas. This is actually the event handler.
     *
     * @param mouseListener the mouse event handler responsible for catching mouse events.
     */
    public void addMouseListener(GameMouseEventHandler mouseListener) {
        gameCanvas.addMouseListener(mouseListener);
        gameCanvas.addMouseMotionListener(mouseListener);
    }

}