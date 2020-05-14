import java.awt.*;

public class Bank extends Player {
    public Bank() {
        super( -1, -1 , new Color( 0x000000FF,true ), null);
        this.name = "Bank";
        this.money = 50000;
        w = 0;
        h = 0;
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
