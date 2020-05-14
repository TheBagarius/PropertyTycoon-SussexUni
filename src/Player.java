import java.awt.*;

public class Player extends GameObject {

    int id;
    String name;
    int money;
    int position;
    boolean broke;

    public Player(int id, int name) {
        this.id = id;
        this.name = "Player " + name;
        money = 1500;
        position = 0;
        broke = false;
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

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int rollDice(Dice dice){
        int first = dice.roll();
        int second = dice.roll();
        return 0;
    }

    public boolean isBroke(){
        return broke;
    }

    @Override
    void gameUpdate(long counter) {

    }

    @Override
    void paint(Graphics g) {

    }
}
