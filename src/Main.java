public class Main {

	GameController gameController;

	public Main(){
		gameController = GameController.getInstance();
		gameController.setGameWindowTitle("Property Tycoon!");
		gameController.setGameWindowSize(1920, 1080);
		System.out.println("[" + gameController.getScreenWidth()+","+gameController.getScreenHeight()+"]");
		gameController.setGameWindowLocation(gameController.getScreenWidth() / 4,
				gameController.getScreenHeight()/4);
		gameController.showGame();
	}

    public static void main(String[] args) {
		Main main = new Main();
	}
}
