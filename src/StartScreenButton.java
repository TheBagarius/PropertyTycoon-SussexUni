import java.awt.event.MouseEvent;

public class StartScreenButton extends Button{


    public StartScreenButton(String dispName, int x, int y, int w, int h){
        super(dispName,x,y,w,h);
    }

    @Override
    void gameUpdate(long counter) {
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        if(isMouseOver(e.getPoint())) {
            switch (dispName){
                case "Start Game" :
                    Main main = Main.getInstance();
                    main.selectPlayers();
                    break;
                case "Rules" :
                    System.out.println("Rules Screen Not Yet Implemented");
                    break;
                case "Settings" :
                    System.out.println("Settings Screen Not Yet Implemented");
                    break;
                case "Exit" :
                    System.exit(0);
                    break;

            }
        }
    }


}
