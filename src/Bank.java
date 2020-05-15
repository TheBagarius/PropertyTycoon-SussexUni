/**
 * This is the Bank player for the Property Tycoon game. It extends the Player class in order
 * to simplify the code.
 *
 * @author 198787
 * @verson 1.0
 */

import java.awt.*;

public class Bank extends Player {
    public Bank() {
        super( -1, -1 , new Color( 0x000000FF,true ), null);
        this.name = "Bank";
        this.money = 50000;
        w = 0;
        h = 0;
    }

    /**
     * Getter Method for ID
     * @return int id
     */
    @Override
    public int getId() {
        return super.getId();
    }

    /**
     * Getter Method for Name
     *
     * @return String name
     */
    @Override
    public String getName() {
        return super.getName();
    }

    /**
     * Getter Method for Money
     * @return int Money; The amount of money currently in the bank
     */
    @Override
    public int getMoney() {
        return super.getMoney();
    }

    /**
     * Method to spend Money. will decrement from internal balance and return the amount.
     *
     * @param amount
     * @return
     */
    @Override
    public int spendMoney( int amount ) {
        return super.spendMoney( amount );
    }

    /**
     * Method to earn Money. will add amount to the internal balance.
     * @param amount
     */
    @Override
    public void earnMoney( int amount ) {
        super.earnMoney( amount );
    }

    /**
     * Check if bank is broke.
     *
     * @return true if broke; false otherwise
     */
    @Override
    public boolean isBroke() {
        return super.isBroke();
    }

    /**
     * Currently used. Called from GameController.
     *
     * @param counter
     */
    @Override
    void gameUpdate( long counter ) {
    }

    /**
     * Currently unused. Called from GameCanvas.
     * @param g
     */
    @Override
    void paint( Graphics g ) {
    }
}
