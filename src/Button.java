/**
 * This is the button class for the Property Tycoon Game
 *
 * TODO factor out mouseClicked behaviour.
 *
 * @author 198787
 * @version 1.0
 */

import java.awt.*;
import java.awt.event.MouseEvent;

public class Button extends GameObject implements GameMouseEventListener{

    String dispName;
    Board board;
    boolean buyPropSet;

    public Button(String dispName, int x, int y, int w, int h, Board board){
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.dispName = dispName;
        this.board = board;
        buyPropSet = false;
    }

    @Override
    void gameUpdate(long counter) {
    }

    /**
     * Draws the object
     *
     * @param g The Graphics object for the game canvas.
     */
    @Override
    void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.drawRect(x,y,w,h);
        g.fillRect(x,y,w,h);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 20));
        g.setColor(Color.black);
        g.drawString(dispName, x + 5, y + (h / 2));

    }

    /**
     * Handles behaviour when clicked. Currently terrible needs abstracting.
     *
     * TODO generalise behaviour
     * TODO replace Don't buy with end turn instead.
     *
     * @param e mouseEvent
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        if (isMouseOver( e.getPoint() )){
            switch ( dispName ){
                case "Roll dice":
                    buyPropSet = false;
                    if(!board.players[board.currentTurn].isBroke()) {
                        int face = board.players[board.currentTurn].rollDice( board.dice );
                        board.movePlayer( board.players[board.currentTurn], face );
                    }
                    board.nextTurn();
                    break;
                case "Buy Property":
                    buyPropSet = true;
                    break;
                case "Don't Buy":
                    buyPropSet = false;
                    break;
            }
        }
    }

    /**
     * check if buyProb is set
     * @return
     */
    public boolean isBuyPropSet() {
        return buyPropSet;
    }

    /**
     * returns if the mouse is over the current object
     *
     * @param mouse point from mouseEvent
     * @return true if mouse is over the object; false otherwise.
     */
    public boolean isMouseOver( Point mouse) {
        // check if y is within range
        return ( mouse.getX() >= x && mouse.getX() <= x + w )   // check if X is within range
                       && ( mouse.getY() >= y && mouse.getY() <= y + h );
    }

    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }
}
