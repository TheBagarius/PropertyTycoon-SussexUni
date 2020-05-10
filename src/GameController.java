/**
 * This is a component of the Simple Game Engine written for the AP Computer Science A
 * course at the Woodstock School, Mussoorie, Uttarakhand, India.
 *
 * The GameController class implements the "Singleton" design pattern to ensure
 * only a single instance can be created. More complex games requiring multiple windows
 * will need to override this via subclassing.
 *
 * @author Jeffrey Santos
 * @version 1.0
 */

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Timer;

public class GameController implements ActionListener {
    private static GameController instance;

    private ArrayList<GameObject> gameObjects;
    private ArrayList<GameObject> addedGameObjects;
    private ArrayList<GameObject> removedGameObjects;
    private GameWindow gameWindow;
    private GameKeyEventHandler gameKeyHandler;
    private GameMouseEventHandler gameMouseHandler;

    private long gameCounter;
    private Timer gameTimer;

    /**
     * Private constructor. (For implementation of the Singleton design pattern.)
     */
    private GameController() {
        gameObjects = new ArrayList<GameObject>();
        removedGameObjects = new ArrayList<GameObject>();
        addedGameObjects = new ArrayList<GameObject>();
        gameWindow = new GameWindow();
        gameKeyHandler = new GameKeyEventHandler();
        gameWindow.addKeyListener(gameKeyHandler);
        gameMouseHandler = new GameMouseEventHandler();
        gameWindow.addMouseListener(gameMouseHandler);
        gameCounter = 0;
        gameTimer = new Timer(5, this);
        gameTimer.start();
    }

    /**
     * This is a static method for creating and retrieving a GameController object.
     * (As indicated by the Singleton design pattern.)
     *
     * @return	an instance of the GameController class.
     */
    public static GameController getInstance() {
        if (instance == null)
            instance = new GameController();
        return instance;
    }

    /**
     * This method is run at the conclusion of every iteration of gameTimer().
     *
     * @param e The ActionEvent object automatically generated.
     */
    public void actionPerformed(ActionEvent e) {
        updateObjects();
        gameWindow.repaint();
        gameCounter += 1;
    }

    /**
     * Adds a GameObject to the list of game objects.
     *
     * @param gameObject The GameObject to be added.
     */
    public void addGameObject(GameObject gameObject) {
        gameObjects.add(gameObject);
    }

    public void addNewGameObject(GameObject gameObject) {
        addedGameObjects.add(gameObject);
    }

    /**
     * Accessor method for the gameCounter attribute.
     *
     * @return The current game counter value.
     */
    public long getGameCounter() {
        return gameCounter;
    }

    /**
     * Accessor method for the gameObject attribute.
     *
     * @return The current list of gameObjects.
     */
    public ArrayList<GameObject> getGameObjects() {
        return gameObjects;
    }

    /**
     * Accessor method for the game window's current height.
     *
     * @return The game window's current height.
     */
    public int getWindowHeight() {
        return gameWindow.getHeight();
    }

    /**
     * Accessor method for the game window's current width.
     *
     * @return The game window's current width.
     */
    public int getWindowWidth() {
        return gameWindow.getWidth();
    }

    /**
     * Registers a key listener to the game key event handler.
     *
     * @param gameKeyListener The object to register as a key listener.
     */
    public void registerKeyListener(GameKeyEventListener gameKeyListener) {
        gameKeyHandler.registerKeyListener(gameKeyListener);
    }

    /**
     * Registers a mouse listener to the game mouse event handler.
     *
     * @param mouseListener The object to register as a mouse listener.
     */
    public void registerMouseListener(GameMouseEventListener mouseListener) {
        gameMouseHandler.registerMouseListener(mouseListener);
    }

    /**
     * Adds an element to the "removedGameObjects" list to be scheduled for removal.
     *
     * @param gameObject The game object set to be removed.
     */
    public void removeGameObject(GameObject gameObject) {
        removedGameObjects.add(gameObject);
    }

    /**
     * Allows for the setting of the background color for the main game window.
     *
     */
    public void setGameWindowBackground(Color color) {gameWindow.setBackground(color);
    }

    /**
     * Allows for the setting of the game window's location on the screen.
     *
     * @param x The x coordinate for the game window.
     * @param y The y coordinate for the game window.
     */
    public void setGameWindowLocation(int x, int y) {
        gameWindow.setLocation(x, y);
    }

    /**
     * Allows for the setting of the game window's size.
     *
     * @param w The width for the game window.
     * @param h The height for the game window.
     */
    public void setGameWindowSize(int w, int h) {
        gameWindow.setSize(w, h);
    }

    /**
     * Allows for the setting of the game window's title.
     *
     * @param title The title for the game window.
     */
    public void setGameWindowTitle(String title) {
        gameWindow.setTitle(title);
    }

    /**
     * Displays the game window on the screen.
     */
    public void showGame() {
        gameWindow.setVisible(true);
    }

    private void updateObjects() {
        gameObjects.removeAll(removedGameObjects);
        removedGameObjects.clear();
        gameObjects.addAll(addedGameObjects);
        addedGameObjects.clear();

        for (GameObject gameObject : gameObjects)
            gameObject.gameUpdate(gameCounter);
    }
}