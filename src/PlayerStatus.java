import java.awt.*;

public class PlayerStatus extends GameObject {

    Player[] players;
    Board board;
    int offset = 100;

    public PlayerStatus( Player[] players, Board board ) {
        this.players = players;
        this.board = board;
        x = 105;
        y = 100;
    }

    @Override
    void gameUpdate( long counter ) {

    }

    @Override
    void paint( Graphics g ) {

        for(int i = 0; i < players.length; i++) {
            g.setColor( players[i].playerColor );
            g.setFont( new Font("TimesRoman", Font.PLAIN, 20) );
            g.drawString( players[i].getName(),x,(i * offset) + y );
            g.drawString( "GBP: " + players[i].getMoney(),x,(i * offset) + y+25 );
            g.drawString( "Pos: " + players[i].getPosition().name,x,(i * offset) + y + 45 );
        }

        g.setColor( players[board.currentTurn].playerColor );
        g.setFont( new Font("TimesRoman", Font.PLAIN, 45) );
        g.drawString( "Current Turn:", 1575, 300  );
        g.drawString( players[board.currentTurn].getName(), 1600, 360  );

    }
}
