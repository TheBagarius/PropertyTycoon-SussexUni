import java.awt.*;

public class propertySquare extends Squares {

    String group;
    Player owner;
    int cost;
    int houseState;
    int[] rent;
    Color sqrColor;

    public propertySquare( int id, String name, String group, Player owner, int cost, int houseState, int[] rent, Color sqrColor ) {
        super( id, name );
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
    }
}
