import javax.swing.*;
import java.awt.event.*;

public class ComboImage extends JFrame implements ItemListener {
    JComboBox<String> box;
    JLabel label;

    ComboImage() {
        String flowers[] = {"rose", "lotus"};

        box = new JComboBox<>(flowers);
        label = new JLabel();

        add(box, "North");
        add(label, "Center");

        box.addItemListener(this);

        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void itemStateChanged(ItemEvent e) {
        String s = (String) box.getSelectedItem();
        label.setIcon(new ImageIcon(s + ".jpg"));
    }

    public static void main(String[] args) {
        new ComboImage();
    }
}