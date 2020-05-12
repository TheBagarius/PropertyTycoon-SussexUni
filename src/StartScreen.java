public class StartScreen extends Screen {

    private GameController gameController;
    private Label gameTitle;
    private StartScreenButton Start;
    private StartScreenButton Rules;
    private StartScreenButton Settings;
    private StartScreenButton Exit;

    public StartScreen() {
        gameController = GameController.getInstance();
    }

    public void drawScreen() {
        gameTitle = new Label("Property Tycoon", gameController.getWindowWidth() / 3, 150,85);

        Start = new StartScreenButton("Start Game", gameController.getWindowWidth() / 4,350,
                gameController.getWindowWidth() / 2,30);
        Rules = new StartScreenButton("Rules", gameController.getWindowWidth() / 4,450,
                gameController.getWindowWidth() / 2,30);
        Settings = new StartScreenButton("Settings", gameController.getWindowWidth() / 4,550,
                gameController.getWindowWidth() / 2,30);
        Exit = new StartScreenButton("Exit", gameController.getWindowWidth() / 4,650,
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

    public void clearScreen(){
        gameController.removeMouseListener(Start);
//        gameController.removeMouseListener(Rules);
//        gameController.removeMouseListener(Settings);
//        gameController.removeMouseListener(Exit);
//
//        gameController.removeGameObject(gameTitle);
//        gameController.removeGameObject(Start);
//        gameController.removeGameObject(Rules);
//        gameController.removeGameObject(Settings);
//        gameController.removeGameObject(Exit);
    }
}
