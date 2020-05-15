import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class selectGame extends JFrame{
    private JButton classicButton;
    private JButton abridgedButton;
    private JLabel Label;
    private JPanel panel;
    private JButton mainMenuButton;

    public selectGame(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel);
        this.pack();

        mainMenuButton.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JFrame f=new mainMenu("Tycoon");
                dispose();
                createFrame(f);
            }
        });

        classicButton.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JFrame f=new GameBoard();
                dispose();
                createFrame(f);
            }
        });

    }
    public static void createFrame(JFrame temp )
    {
        EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                JFrame frame = temp;
                frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                try
                {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });
    }
    }

