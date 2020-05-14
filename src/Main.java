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

	public static void main(String[] args) {
		Main main = new Main();
		main.BoardScreen();
	}

	public void BoardScreen() {
		screen = new Board(6);
		screen.drawScreen();
	}
}
