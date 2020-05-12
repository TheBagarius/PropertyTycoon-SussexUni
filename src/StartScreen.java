public class StartScreen {

    GameController gameController;

    public StartScreen() {
        gameController = GameController.getInstance();
    }

    public void drawScreen() {
        for (GameObject a : gameController.getGameObjects()) {
            gameController.removeGameObject(a);
        }

        Label gameTitle = new Label("Property Tycoon", gameController.getWindowWidth() / 3, 150,85);

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

        gameController.addGameObject(gameTitle);
        gameController.addGameObject(Start);
        gameController.addGameObject(Rules);
        gameController.addGameObject(Settings);
        gameController.addGameObject(Exit);
    }
}
