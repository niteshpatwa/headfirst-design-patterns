package Frames;

import javax.swing.JFrame;
import java.awt.Graphics;

public class MyFrame extends JFrame {
    public MyFrame(String title) {
        setTitle(title);
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // A hook method called paint
    public void paint(Graphics graphics) {
        super.paint(graphics);
        String message = "Hello, Swing!";
        graphics.drawString(message, 100, 100);
    }

    public static void main(String[] args) {
        new MyFrame("Head First Design Patterns");
    }
}
