package SwingApp;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JButton button = new JButton("Should I do it?");
        button.addActionListener(e -> System.out.println("Don't do it, you might regret it!"));
        button.addActionListener(e -> System.out.println("Come on, do it!"));

        frame.add(button);
        frame.setVisible(true);
    }
}
