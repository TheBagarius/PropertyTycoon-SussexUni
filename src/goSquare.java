import java.awt.*;

public class goSquare extends Squares {

    public goSquare(int id, String name) {
        super(id, name);
    }

    @Override
    public void doThis(Player player, Board board) {
        super.doThis(player, board);
        player.earnMoney(200); //replace with bank later
    }

    @Override
    void gameUpdate(long counter) {
        super.gameUpdate(counter);
    }

    @Override
    void paint(Graphics g) {
        super.paint(g);
    }
}
