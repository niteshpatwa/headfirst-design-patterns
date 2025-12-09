package SwingApp;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/*
    Client	 -> SwingObserverExample.go() method
    Commands -> ActionListener lambdas (e -> panel.setBackground(...))
    Invoker	 -> JButton objects (onButton, offButton)
    Receiver ->	JPanel panel
*/

public class SwingObserverExample {
    JFrame frame;
    JPanel panel;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go() {
        frame = new JFrame();
        panel = new JPanel();

        JButton onButton = new JButton("On");
        JButton offButton = new JButton("Off");

        onButton.addActionListener(e -> panel.setBackground(Color.YELLOW));
        offButton.addActionListener(e -> panel.setBackground(Color.DARK_GRAY));

        frame.setContentPane(panel);
        panel.add(onButton);
        panel.add(offButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
