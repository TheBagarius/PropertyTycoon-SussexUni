import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class rules extends JFrame{
    private JButton mainMenuButton;
    private JPanel panel;

    public rules(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel);
        this.pack();

        mainMenuButton.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JFrame f=new mainMenu("menu");
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

