import java.awt.Color;
import java.awt.Graphics;

public class Player extends GameObject {

    protected int id;
    protected String name;
    protected int money;
    protected Squares position;
    protected boolean broke;
    protected Color playerColor;

    public Player(int id, int name, Color playerColor, Squares position) {
        this.id = id;
        this.name = "Player " + name;
        this.playerColor = playerColor;
        money = 1500;
        this.position = position;
        broke = false;
        w = 30;
        h = 30;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public int spendMoney(int amount) {
        if (money - amount < 0) {
            return 0;
        }
        money -= amount;
        return amount;
    }

    public void earnMoney(int amount) {
        money += amount;
    }

    public Squares getPosition() {
        return position;
    }

    public void setPosition(Squares position) {
        this.position = position;
    }

    public int rollDice(Dice dice) {
        int roll = dice.roll();
        return roll;
    }

    public boolean isBroke() {
        return broke;
    }

    @Override
    void gameUpdate(long counter) {
        if (money < 1) broke = true;
        if (money > 0) broke = false;
        x = position.x + 40;
        y = position.y + 40;
    }

    @Override
    void paint(Graphics g) {
        g.setColor(playerColor);
        g.fillRect(x, y, w, h);
    }
}
