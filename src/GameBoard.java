import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Game board
 */
public class GameBoard extends JFrame {

    //image files name
    private static final String[] IMAGE_FILENAMES = {
            /*South*/
        "1_Go.jpg", "2_Crapper Street.png", "3_PotLucky.png", "4_Gangsters Paradise.png",
            "5_incomeTax.png", "6_BristonStation.jpg", "7_Weeping Angel.png", "8_Opportunity Knocks.jpg",
            "9_Potts Avenue.png", "10_Nardole Drive.png", "11_JailOrJust visiting.png",

            /*West*/
            "12_Skywalker Drive.png", "13_Tesla Power Co.jpg", "14_Wookie Hole.png", "15_Rey Lane.png",
            "16_Hove Station.jpg", "17_Cooper Drive.png", "18_PotLucky2.png", "19_Wolowitz Street.png",
            "20_Penny Lane.png",

            /*North*/
            "21_Free Parking.png", "22_Yue Fei Square.png", "23_Opportunity Knocks .jpg", "24_Mulan Rouge.png",
            "25_Han Xin Gardens.png", "26_Falmer Station.jpg", "27_Kirk Close.png", "28_Picard Avenue.png",
            "29_Edison Water.jpg", "30_Crusher Creek.png", "31_Go to Jail.png",

            /*East*/
            "32_Sirat Mews.png", "33_Ghengis Crescent.png", "34_PotLucky3.png", "35_Ibis Close.png",
            "36_Lewes Station.jpg", "37_Opportunity Knocks.jpg", "38_Hawking Way.png", "39_SuperTax2.png",
            "38_Hawking Way.png"
    };

    /**
     * lucky
     */
    private static String[] LUCKY_ARRAY = {
            "1.png",
            "2.png",
            "3.png",
            "4.png",
            "5.png",
            "6.png",
            "7.png",
            "8.png",
            "9.png",
            "10.png",
            "11.png",
            "12.png",
            "13.png",
            "14.png",
            "15.png",
            "16.png",
    };

    /**
     * opportunities
     */
    private static String[] OPPORTUNITY_ARRAY = {
            "a.png",
            "b.png",
            "c.png",
            "d.png",
            "e.png",
            "f.png",
            "g.png",
            "h.png",
            "i.png",
            "g.png",
            "k.png",
            "l.png",
            "m.png",
            "n.png",
            "o.png",
            "p.png",
    };

    /**
     * opportunity label
     */
    private JLabel lblOpportunity = new JLabel(new ImageIcon("images/" + "default.png"));

    /**
     * opportunity button
     */
    private JButton btnOpportunity = new JButton("Choose Opportunity");

    /**
     * Lucky label
     */
    private JLabel lblLucky = new JLabel(new ImageIcon("images/" + "default.png"));

    /**
     * Lucky button
     */
    private JButton btnLucky = new JButton("Choose Lucky");

    /**
     * dice label
     */
    private JLabel lblDice = new JLabel(new ImageIcon("images/" + "dice0.png"));

    /**
     * roll button
     */
    private JButton btnRoll = new JButton("Roll");

    /**
     * current opportunity
     */
    private int opportunity = 0;

    /**
     * current lucky
     */
    private int lucky = 0;

    /**
     * constructor
     */
    public GameBoard(){
        //initialize component
        initialize();
    }

    /**
     * initialize component
     */
    public void initialize(){

        // property border
        Border border = BorderFactory.createLineBorder(Color.BLACK, 1);

        //North
        JPanel pnlNorth = new JPanel(new GridLayout(1, 11));
        for (int i = 20; i < 31; i++){
            JLabel label = new JLabel(new ImageIcon("images/" + IMAGE_FILENAMES[i]));
            label.setBorder(border);
            pnlNorth.add(label);
        }

        add(pnlNorth, BorderLayout.NORTH);

        //West
        JPanel pnlWest = new JPanel(new GridLayout(9, 1));
        for (int i = 11; i < 20; i++){
            JLabel label = new JLabel(new ImageIcon("images/" + IMAGE_FILENAMES[i]));
            label.setBorder(border);
            pnlWest.add(label);
        }
        add(pnlWest, BorderLayout.WEST);

        //East
        JPanel pnlEast = new JPanel(new GridLayout(9, 1));
        for (int i = 31; i < 40; i++){
            JLabel label = new JLabel(new ImageIcon("images/" + IMAGE_FILENAMES[i]));
            label.setBorder(border);
            pnlEast.add(label);
        }
        add(pnlEast, BorderLayout.EAST);

        //South panel
        JPanel pnlSouth = new JPanel(new GridLayout(1, 11));
        for (int i = 10; i >= 0; i--){
            JLabel label = new JLabel(new ImageIcon("images/" + IMAGE_FILENAMES[i]));
            label.setBorder(border);
            pnlSouth.add(label);
        }
        add(pnlSouth, BorderLayout.SOUTH);

        //center frame
        JPanel pnlCenter = new JPanel();
        pnlCenter.add(lblOpportunity);
        pnlCenter.add(btnOpportunity);
        pnlCenter.add(lblLucky);
        pnlCenter.add(btnLucky);
        pnlCenter.add(lblDice);
        pnlCenter.add(btnRoll);
        btnOpportunity.setPreferredSize(new Dimension(200, 45));
        btnLucky.setPreferredSize(new Dimension(200, 45));
        btnRoll.setPreferredSize(new Dimension(200, 45));

        add(pnlCenter, BorderLayout.CENTER);

        //random opportunities
        List<String> strList = Arrays.asList(OPPORTUNITY_ARRAY);
        Collections.shuffle(strList);
        strList.toArray(OPPORTUNITY_ARRAY);

        strList = Arrays.asList(LUCKY_ARRAY);
        Collections.shuffle(strList);
        strList.toArray(LUCKY_ARRAY);

        //set frame properties
        setSize(850, 850);
        setLocationRelativeTo(null); //center frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit if x is pressed

        //set action
        btnOpportunity.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeOpportunity();
            }
        });

        btnLucky.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeLucky();
            }
        });

        btnRoll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                roll();
            }
        });
    }

    /**
     * change opportunity
     */
    private void changeOpportunity(){

        lblOpportunity.setIcon(new ImageIcon("images/" + OPPORTUNITY_ARRAY[opportunity]));
        //next opportunity
        opportunity = (opportunity + 1) % OPPORTUNITY_ARRAY.length;
    }

    /**
     * change lucky
     */
    private void changeLucky(){

        lblLucky.setIcon(new ImageIcon("images/" + LUCKY_ARRAY[lucky]));
        //next luck
        lucky = (lucky + 1) % LUCKY_ARRAY.length;
    }

    /**
     * roll
     */
    private void roll(){

        (new Thread(){
            @Override
            public void run() {
                btnRoll.setEnabled(false);
                int loop = (int)(Math.random() * 4) + 4;
                for (int i = 0; i < loop; i++){
                    int rand = (int)(Math.random() * 6) + 1;
                    lblDice.setIcon(new ImageIcon("images/dice" + rand + ".png"));
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                    }
                }
                btnRoll.setEnabled(true);
            }
        }).start();

    }
}
