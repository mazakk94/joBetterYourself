package lab_jdbc;

import java.awt.Color;
import javax.swing.*;

public class FrameMaker extends JFrame {

    private JFrame frame;
    private JPanel panel;
    private JButton button;
    private JLabel label;

    public FrameMaker(String title) {

        frame = new JFrame(title);
        frame.setVisible(true);
        frame.setSize(1200, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setBackground(Color.blue);

        button = new JButton("Click Me!");
        label = new JLabel("Label1");

        panel.add(button);
        panel.add(label);
        frame.add(panel);
    }
}
