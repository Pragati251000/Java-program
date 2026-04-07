import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ColorChanger extends JFrame {
    JButton button;

    ColorChanger() {
        button = new JButton("Select Color");

        add(button);

        button.addActionListener(e -> {
            Color c = JColorChooser.showDialog(this, "Choose Color", Color.WHITE);
            getContentPane().setBackground(c);
        });

        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ColorChanger();
    }
}