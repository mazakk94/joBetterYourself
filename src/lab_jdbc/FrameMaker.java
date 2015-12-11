package lab_jdbc;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrameMaker extends JFrame {

    private JFrame frame;
    private JPanel panel;
    private JButton button;
    private JLabel label;

    public FrameMaker(String title) {

        //super(title);                     // invoke the JFrame constructor
        frame = new JFrame(title);
        frame.setVisible(true);
        frame.setSize(1200, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setLayout(new FlowLayout());      // set the layout manager

        panel = new JPanel();
        panel.setBackground(Color.blue);

        button = new JButton("Click Me!"); // construct a JButton
        label = new JLabel("Label1");

        panel.add(button);
        panel.add(label);
        frame.add(panel);
    }

}
