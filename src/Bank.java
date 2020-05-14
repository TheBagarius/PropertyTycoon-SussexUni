import java.awt.*;

public class Bank extends Player {
    public Bank() {
        super( -1, -1 );
        this.name = "Bank";
        this.money = 50000;
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getMoney() {
        return super.getMoney();
    }

    @Override
    public int spendMoney( int amount ) {
        return super.spendMoney( amount );
    }

    @Override
    public void earnMoney( int amount ) {
        super.earnMoney( amount );
    }

    @Override
    public int getPosition() {
        return super.getPosition();
    }

    @Override
    public void setPosition( int position ) {
        super.setPosition( position );
    }

    @Override
    public int rollDice( Dice dice ) {
        return super.rollDice( dice );
    }

    @Override
    public boolean isBroke() {
        return super.isBroke();
    }

    @Override
    void gameUpdate( long counter ) {
    }

    @Override
    void paint( Graphics g ) {
    }
}
