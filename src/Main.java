public class Main {

	private static Main instance;

	GameController gameController;

	private static Main getInstance(){
		if (instance == null)
			instance = new Main();
		return instance;
	}

	private Main(){
		gameController = GameController.getInstance();
		gameController.setGameWindowTitle("Property Tycoon!");
		gameController.setGameWindowSize(1920, 1080);
		System.out.println("[" + gameController.getScreenWidth()+","+gameController.getScreenHeight()+"]");
		gameController.setGameWindowLocation(gameController.getScreenWidth() / 4,
				gameController.getScreenHeight()/4);
		gameController.showGame();
	}

	public void startScreen() {

		for (GameObject a : gameController.getGameObjects()) {
			gameController.removeGameObject(a);
		}

		StartScreenButton Start = new StartScreenButton("Start Game", gameController.getWindowWidth() / 4,350,
				gameController.getWindowWidth() / 2,30);
		StartScreenButton Rules = new StartScreenButton("Rules", gameController.getWindowWidth() / 4,450,
				gameController.getWindowWidth() / 2,30);
		StartScreenButton Settings = new StartScreenButton("Settings", gameController.getWindowWidth() / 4,550,
				gameController.getWindowWidth() / 2,30);
		StartScreenButton Exit = new StartScreenButton("Exit", gameController.getWindowWidth() / 4,650,
				gameController.getWindowWidth() / 2,30);

		gameController.registerMouseListener(Start);
		gameController.registerMouseListener(Rules);
		gameController.registerMouseListener(Settings);
		gameController.registerMouseListener(Exit);

		gameController.addGameObject(Start);
		gameController.addGameObject(Rules);
		gameController.addGameObject(Settings);
		gameController.addGameObject(Exit);
	}

	public void selectPlayersScreen(){

	}

	public static void main(String[] args) {
		Main main = Main.getInstance();
		main.startScreen();
	}
}