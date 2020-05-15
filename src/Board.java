/**
 * This is the Board object of the Property Tycoon Game. It creates and runs
 * each game and manages the screen for it.
 *
 * @author 198787
 * @version 1.0
 */

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

    /**
     * The constructor create a game for the number of players specificed in maxPlayers. It does not
     * check if the number of players is within acceptable limits as that is supposed to be done in
     * another screen (yet to be implemented).
     * @param maxPlayers
     */
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

    /**
     * adds the objects created to the game controller and registers appropriate objects as Mouse
     * and Key listeners.
     *
     * Can be improved and automated by refactoring.
     */
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

    /**
     * moves a player the number of places specified in face. Returns the square player has
     * been moved to.
     * @param player
     * @param face
     * @return Square player moved to.
     */
    public Squares movePlayer(Player player, int face) {
        if(player.isBroke()){ player.getPosition(); }
        int newPosition = normalizePosition(player.getPosition().id + face);
        player.setPosition(squares[newPosition]);
        squares[newPosition].doThis(player, this);
        return squares[newPosition];
    }

    /**
     * Normalize new position. IE rollover position at the end of the board. not implemented
     * properly since java's modulus operator doesn't work the same as it would in maths.
     *
     * @param position
     * @return int position corrected to avoid overflow.
     */
    public int normalizePosition(int position) {
        return position % squares.length;
    }

    /**
     * Increment currentTurn, rollover if end reached.
     */
    public void nextTurn() {
        if(++currentTurn >= players.length){
            currentTurn = 0;
        }
    }

    /**
     * USED
     * Checks if only one player is not broke. DOES NOT CHECK if bank is broke.
     *
     * @return true if only one player is not broke; false otherwise.
     */
    public boolean hasWinner() {
        int ingame = 0;
        for(Player p :players){
            if(!p .isBroke()){
                ingame++;
            }
        }
        return ingame <= 1;
    }

    /**
     * USED.
     * gets last player standing, ie the winner.
     *
     * @return Player that is the last one standing. null otherwise.
     */
    public Player getWinner() {
        if(!hasWinner()){ return null; }
        for(Player p : players){
            if(!p.isBroke()){ return p ; }
        }
        return null;
    }

    /**
     * TODO
     */
    @Override
    void clearScreen() {
    }


}
