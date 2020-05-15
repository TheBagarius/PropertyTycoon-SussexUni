/**
 * Draws labels on the screen.
 *
 * TODO label color needs to be selectable.
 *
 * @author 198787
 * @version 1.0
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Label extends GameObject {

  private String labeltxt;
  private int fontSize;

  public Label(String labeltxt, int x, int y, int fontSize) {
    this.x = x;
      this.y = y;
    this.labeltxt = labeltxt;
    this.fontSize = fontSize;
  }

  @Override
  void gameUpdate(long counter) {}

  @Override
  void paint(Graphics g) {
    g.setColor(Color.BLUE);
    g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
    g.drawString(labeltxt, x, y);
  }
}
