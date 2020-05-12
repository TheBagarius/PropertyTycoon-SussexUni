public class SelectPlayersScreen extends Screen{

    private GameController gameController;
    private Label gameTitle;
    private SelectPlayersScreenButton Back;
    private SelectPlayersScreenButton Two;
    private SelectPlayersScreenButton Three;
    private SelectPlayersScreenButton Four;
    private SelectPlayersScreenButton Five;
    private SelectPlayersScreenButton Six;

    private int buttonSize;
    private int buttonSpace;

    public SelectPlayersScreen(){
        gameController = GameController.getInstance();
        buttonSize = 75;
        buttonSpace = 100 + buttonSize;

    }

    public void drawScreen(){
        for (GameObject a : gameController.getGameObjects()) {
            gameController.removeGameObject(a);
        }

        gameTitle = new Label("Property Tycoon", gameController.getWindowWidth() / 3, 150,85);

        Two = new SelectPlayersScreenButton("Two", (gameController.getWindowWidth() / 4),350,
                buttonSize,buttonSize);
        Three = new SelectPlayersScreenButton("Three", (gameController.getWindowWidth() / 4) + buttonSpace,350,
                buttonSize,buttonSize);
        Four = new SelectPlayersScreenButton("Four", (gameController.getWindowWidth() / 4) + 2*buttonSpace,350,
                buttonSize,buttonSize);
        Five = new SelectPlayersScreenButton("Five", (gameController.getWindowWidth() / 4) + 3*buttonSpace,350,
                buttonSize,buttonSize);
        Six = new SelectPlayersScreenButton("Six", (gameController.getWindowWidth() / 4) + 4*buttonSpace,350,
                buttonSize,buttonSize);

        Back = new SelectPlayersScreenButton("Back", gameController.getWindowWidth() / 4,650,
                gameController.getWindowWidth() / 2,30);

        gameController.registerMouseListener(Back);
        gameController.registerMouseListener(Two);
        gameController.registerMouseListener(Three);
        gameController.registerMouseListener(Four);
        gameController.registerMouseListener(Five);
        gameController.registerMouseListener(Six);

        gameController.addGameObject(gameTitle);
        gameController.addGameObject(Two);
        gameController.addGameObject(Three);
        gameController.addGameObject(Four);
        gameController.addGameObject(Five);
        gameController.addGameObject(Six);
        gameController.addGameObject(Back);

    }

    @Override
    void clearScreen() {
        gameController.removeMouseListener(Back);
        gameController.removeMouseListener(Two);
        gameController.removeMouseListener(Three);
        gameController.removeMouseListener(Four);
        gameController.removeMouseListener(Five);
        gameController.removeMouseListener(Six);

        gameController.removeGameObject(gameTitle);
        gameController.removeGameObject(Two);
        gameController.removeGameObject(Three);
        gameController.removeGameObject(Four);
        gameController.removeGameObject(Five);
        gameController.removeGameObject(Six);
        gameController.removeGameObject(Back);

    }

}
