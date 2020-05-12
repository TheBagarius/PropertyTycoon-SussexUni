import java.awt.*;
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
                    System.out.println("Hello");
                    break;
                case "Rules" :
                    System.out.println("Not yet Implemented");
                    break;
                case "Settings" :
                    System.out.println("Not yet Implemented again");
                    break;
                case "Exit" :
                    System.exit(0);
                    break;

            }
        }
    }


}
