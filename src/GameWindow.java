/**
 * This is a component of the Simple Game Engine written by * <a href="https://github.com/jmscsedu">
 * Jeffery Santos</a> and made available * privately to those enrolled or have taken a course taught
 * by him.
 *
 * <p>The GameWindow is responsible for drawing the game's window on screen. It also holds the
 * GameCanvas, which represents the internal drawing area for the game.
 *
 * @author Jeffrey Santos
 * @version 1.0
 */
import java.awt.Color;
import javax.swing.JFrame;

public class GameWindow extends JFrame {
  GameCanvas gameCanvas;

  /** Constructor for setting up default values and creating the game canvas. */
  public GameWindow() {
    gameCanvas = new GameCanvas();
    add(gameCanvas);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setResizable(false);
    gameCanvas.setBackground(Color.black);
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
