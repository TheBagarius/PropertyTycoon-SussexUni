import java.awt.*;

public class propertySquare extends Squares {

    String group;
    Player owner;
    int cost;
    int houseState;
    int[] rent;
    Color sqrColor;

    public propertySquare(int x, int y, int w, int h, int id, String name, String group, Player owner, int cost, int houseState, int[] rent, Color sqrColor ) {
        super(x,y,w,h, id, name );
        this.group = group;
        this.owner = owner;
        this.cost = cost;
        this.houseState = houseState;
        this.rent = rent;
        this.sqrColor = sqrColor;
    }

    @Override
    public void doThis( Player player, Board board ) {
        super.doThis( player, board );
    }

    @Override
    void gameUpdate( long counter ) {
        super.gameUpdate( counter );
    }

    @Override
    void paint( Graphics g ) {
        super.paint( g );
        g.setColor( sqrColor );
        g.fillRect( x,y,w,20 );

        g.setColor( owner.playerColor );
        g.drawString( owner.getName(), x+5, y + 65 );
    }
}
