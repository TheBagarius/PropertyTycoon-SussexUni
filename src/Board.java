import java.awt.*;

public class Board extends Screen {

    int currentTurn;
    int maxPlayers;
    Player[] players;
    Bank bank;
    Squares[] squares;
    Color[] playerColors = {new Color(0xD0372C),new Color(0xD09B1D),new Color( 0x2B263E ), new Color(0x5FAAC6),new Color(0x30604A),new Color(0xA4611F)};

    public Board(int maxPlayers) {
        players = new Player[maxPlayers];
        this.maxPlayers = maxPlayers;

        for (int i = 0; i < maxPlayers;i++){
            players[i] = new Player( i,i );
        }

        bank = new Bank();

        squares = Helper.generateSquares(bank);
    }

    @Override
    void drawScreen() {


    }

    @Override
    void clearScreen() {
    }
}
