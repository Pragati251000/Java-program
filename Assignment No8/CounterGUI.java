import javax.swing.*;

public class CounterGUI {
    public static void main(String[] args) {
        JFrame f = new JFrame("Counter");

        JTextField tf = new JTextField("0", 5);
        JButton up = new JButton("Up");
        JButton down = new JButton("Down");
        JButton reset = new JButton("Reset");

        JPanel p = new JPanel();
        p.add(new JLabel("Counter"));
        p.add(tf);
        p.add(up);
        p.add(down);
        p.add(reset);
        f.add(p);

        up.addActionListener(e -> tf.setText("" + (Integer.parseInt(tf.getText()) + 1)));
        down.addActionListener(e -> tf.setText("" + (Integer.parseInt(tf.getText()) - 1)));
        reset.addActionListener(e -> tf.setText("0"));

        f.setSize(300,120);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
