import javax.swing.*;
import java.awt.event.*;

public class TextCounter extends JFrame {
    JTextArea area;
    JLabel label;

    TextCounter() {
        area = new JTextArea(5, 20);
        label = new JLabel("Words: 0 Characters: 0");

        add(new JScrollPane(area), "Center");
        add(label, "South");

        area.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                String text = area.getText();
                int chars = text.length();
                int words = text.trim().isEmpty() ? 0 : text.trim().split("\\s+").length;

                label.setText("Words: " + words + " Characters: " + chars);
            }
        });

        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TextCounter();
    }
}