    import javax.swing.*;
    import javax.swing.text.DefaultCaret;
    import java.awt.*;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import java.awt.event.ComponentAdapter;

    public class tycoon extends JFrame{

        private JButton selectGameButton;
        private JButton settingsButton;
        private JButton rulesButton;
        private JButton exitGameButton;
        private JPanel panel1;
        private JLabel propertyTycoonLabel;

        public tycoon(String title){
    super(title);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setContentPane(panel1);
    this.pack();

        selectGameButton.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                dispose();
                createFrame();
            }
        });
    }

        public static void createFrame()
        {
            EventQueue.invokeLater(new Runnable()
            {
                @Override
                public void run()
                {
                    JFrame frame = new Tycoon2("Select");
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


        private void createUIComponents() {
            // TODO: place custom component creation code here
        }
    }
