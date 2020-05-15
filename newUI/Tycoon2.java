import javax.swing.*;

public class Tycoon2 extends JFrame{
    private JButton classicButton;
    private JButton abridgedButton;
    private JLabel Label;
    private JPanel panel;

    public Tycoon2(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel);
        this.pack();
    }
}
