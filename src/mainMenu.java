            import javax.swing.*;
            import java.awt.*;
            import java.awt.event.ActionEvent;
            import java.awt.event.ActionListener;

            public class mainMenu extends JFrame{

                private JButton selectGameButton;
                private JButton settingsButton;
                private JButton rulesButton;
                private JButton exitGameButton;
                private JPanel panel1;
                private JLabel propertyTycoonLabel;

                public mainMenu(String title){
            super(title);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setContentPane(panel1);
            this.pack();

                selectGameButton.addActionListener( new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        JFrame f=new selectGame("Tycoon");
                        dispose();
                        createFrame(f);
                    }
                });

                    rulesButton.addActionListener( new ActionListener()
                    {
                        public void actionPerformed(ActionEvent e)
                        {
                            JFrame f=new rules("Tycoon");
                            dispose();
                            createFrame(f);
                        }
                    });

                    settingsButton.addActionListener( new ActionListener()
                    {
                        public void actionPerformed(ActionEvent e)
                        {
                            JFrame f=new settingsPage("Tycoon");
                            dispose();
                            createFrame(f);
                        }
                    });

                    exitGameButton.addActionListener( new ActionListener()
                    {
                        public void actionPerformed(ActionEvent e)
                        {
                            System.exit(0);
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
