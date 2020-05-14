import java.awt.*;

public class Main {

	private static Main instance;

	private GameController gameController;
	private Screen screen;

	public static Main getInstance(){
		if (instance == null)
			instance = new Main();
		return instance;
	}

	private Main(){
		gameController = GameController.getInstance();
		gameController.setGameWindowTitle("Property Tycoon!");
		gameController.setGameWindowSize(1920, 1080);
		gameController.setGameWindowBackground(Color.DARK_GRAY);
		System.out.println("[" + gameController.getScreenWidth()+","+gameController.getScreenHeight()+"]");
		gameController.setGameWindowLocation(gameController.getScreenWidth() / 4,
				gameController.getScreenHeight()/4);
		gameController.showGame();
	}

	public void BoardScreen(){
		screen = new Board(2);
	}

	public static void main(String[] args) {
		Main main = Main.getInstance();
	}
}