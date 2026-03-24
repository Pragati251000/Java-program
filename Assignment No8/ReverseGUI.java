import javax.swing.*;

public class ReverseGUI {
    public static void main(String[] args) {
        JFrame f = new JFrame("Reverse Number");

        JTextField tf = new JTextField(10);
        JButton btn = new JButton("Reverse");
        JLabel result = new JLabel("Result");

        JPanel p = new JPanel();
        p.add(new JLabel("Number"));
        p.add(tf);
        p.add(btn);
        p.add(result);
        f.add(p);

        btn.addActionListener(e -> {
            String s = tf.getText();
            String rev = new StringBuilder(s).reverse().toString();
            result.setText("Result: " + rev);
        });

        f.setSize(300,120);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
