import javax.swing.*;

public class RadioGUI {
    public static void main(String[] args) {
        JFrame f = new JFrame("Gender");

        JRadioButton m = new JRadioButton("Male");
        JRadioButton f1 = new JRadioButton("Female");
        JButton btn = new JButton("Submit");
        JLabel result = new JLabel();

        ButtonGroup bg = new ButtonGroup();
        bg.add(m);
        bg.add(f1);

        JPanel p = new JPanel();
        p.add(m);
        p.add(f1);
        p.add(btn);
        p.add(result);
        f.add(p);

        btn.addActionListener(e -> {
            if (m.isSelected()) result.setText("Male selected");
            else if (f1.isSelected()) result.setText("Female selected");
        });

        f.setSize(300,120);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
