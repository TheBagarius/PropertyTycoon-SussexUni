import java.awt.*;

public class Board extends Screen {

    GameController gameController;

    int currentTurn;
    int maxPlayers;
    Player[] players;
    Bank bank;
    Squares[] squares;
    Dice dice;
    Color[] playerColors = {new Color(0xD0372C),new Color(0xD09B1D),new Color( 0x2B263E ), new Color(0x5FAAC6),new Color(0x30604A),new Color(0xA4611F)};

    Card oppKnock = new Card( 635, "Example Opportunity Knock Card" );
    Card potLuck = new Card( 984, "Example Pot Luck Card" );

    Button rollDice;
    Button buyProperty;
    Button dontBuy;

    PlayerStatus status;

    public Board(int maxPlayers) {
        gameController = GameController.getInstance();

        players = new Player[maxPlayers];
        this.maxPlayers = maxPlayers;

        bank = new Bank();

        squares = Helper.generateSquares(bank);

        dice = new Dice();

        for (int i = 0; i < maxPlayers;i++){
            players[i] = new Player( i,i+1, playerColors[i],squares[0] );
        }

        status = new PlayerStatus( players,this );

        rollDice = new Button( "Roll dice",1122,700, 150,50 , this);
        buyProperty = new Button( "Buy Property",1122,755, 150,50 , this);
        dontBuy = new Button( "Don't Buy",1122,810, 150,50, this );
    }

    @Override
    void drawScreen() {

        gameController.addGameObject( status );

        gameController.addGameObject( new Label( "Property Tycoon", 600,540,86 ) );

        gameController.addGameObject( oppKnock );
        gameController.addGameObject( potLuck );

        gameController.addGameObject( bank );

        for (Squares s : squares) {
            gameController.addGameObject( s );
        }

        for ( Player p : players ) {
            gameController.addGameObject( p );
        }

        gameController.addGameObject( dice );

        gameController.addGameObject( rollDice );
        gameController.addGameObject( buyProperty);
        gameController.addGameObject( dontBuy );
        gameController.registerMouseListener( rollDice );
        gameController.registerMouseListener( buyProperty );
        gameController.registerMouseListener( dontBuy );

    }

    public Squares movePlayer(Player player, int face) {
        return movePlayer(player, face, true);
    }

    public Squares movePlayer(Player player, int face, boolean count) {
        if(player.isBroke()){ player.getPosition(); }
        int newPosition = normalizePosition(player.getPosition().id + face);
        player.setPosition(squares[newPosition]);
        squares[newPosition].doThis(player, this);
        return squares[newPosition];
    }

    public int normalizePosition(int position) {
        return position % squares.length;
    }

    public void nextTurn() {
        if(++currentTurn >= players.length){
            currentTurn = 0;
        }
    }

    public boolean hasWinner() {
        int ingame = 0;
        for(Player p :players){
            if(!p .isBroke()){
                ingame++;
            }
        }
        return ingame <= 1;
    }

    public Player getWinner() {
        if(!hasWinner()){ return null; }
        for(Player p : players){
            if(!p.isBroke()){ return p ; }
        }
        return null;
    }

    @Override
    void clearScreen() {
    }


}
