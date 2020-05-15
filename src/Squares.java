/**
 * Board Squares class for Property Tycoon Game.
 *
 * @author 198787
 * @version 1.0
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Squares extends GameObject {

    int id;
    String name;

    public Squares(int x, int y, int w, int h, int id, String name) {
        this.id = id;
        this.name = name;
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    public void doThis(Player player, Board board) {
        // Implement
    }

    @Override
    void gameUpdate(long counter) {}

    @Override
    void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(x, y, w, h);
        g.setColor(Color.WHITE);
        g.fillRect(x + 1, y + 1, w - 2, h - 2);
        g.setColor(Color.BLACK);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 12));
        for (String line : name.split(" ")) {
            g.drawString(line, x + 5, 35 + y + g.getFontMetrics().getHeight());
        }
    }
}
