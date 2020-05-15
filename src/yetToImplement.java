/**
 * yet to implement squares such as utilities and stations
 *
 * @author 198787
 * @version 1.0
 */

import java.awt.Color;
import java.awt.Graphics;

public class yetToImplement extends Squares {

  String group;
  Player owner;
  int cost;
  Color sqrColor;

  public yetToImplement(
      int x, int y, int w, int h, int id, String name, String group, Player owner, int cost) {
    super(x, y, w, h, id, name);
    this.group = group;
    this.owner = owner;
    this.cost = cost;
    sqrColor = new Color(0x111111AA, true);
  }

  @Override
  public void doThis(Player player, Board board) {
    super.doThis(player, board);
  }

  @Override
  void gameUpdate(long counter) {
    super.gameUpdate(counter);
  }

  @Override
  void paint(Graphics g) {
    super.paint(g);
    g.setColor(sqrColor);
    g.fillRect(x, y, w, 20);
  }
}
