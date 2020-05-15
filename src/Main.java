/**
 * This is the main class for the Property Tycoon game.
 *
 * <p>It handles window creation and screen switching. </p>
 *
 *
 * TODO:
 *  - Create all other screens
 *  - Fix Concurrent Modification Error on GameMouseEventHandler when removing a
 *  Mouse Listener Object
 *  - Make it Pretty
 *
 * @author 198787
 * @version 1.0
 *
 *
 */


import java.awt.Color;

public class Main {

	private GameController gameController;
	private Screen screen;

	public Main() {
		gameController = GameController.getInstance();
		gameController.setGameWindowTitle("Property Tycoon!");
		gameController.setGameWindowSize(1920, 1170);
		gameController.setGameWindowBackground(Color.DARK_GRAY);
		System.out.println(
				"(" + gameController.getScreenWidth() + "," + gameController.getScreenHeight() + ")");
		gameController.setGameWindowLocation(
				gameController.getScreenWidth() / 4, gameController.getScreenHeight() / 4);
		gameController.showGame();
	}

	/**
	 * This method creates the board screen in the window
	 *
	 */
	public void BoardScreen() {
		screen = new Board(6);
		screen.drawScreen();
	}

	public static void main(String[] args) {
		Main main = new Main();
		main.BoardScreen();
	}

}
