import javax.swing.*;
import java.awt.*;

public class Stopwatch extends JFrame implements Runnable {

    JLabel label;
    int seconds = 0;
    Thread t;

    public Stopwatch() {
        label = new JLabel("Time: 0 sec", JLabel.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 30));

        add(label);
        setSize(300, 200);
        setTitle("Stopwatch");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        t = new Thread(this);
        t.start();
    }

    public void run() {
        while (true) {
            seconds++;
            label.setText("Time: " + seconds + " sec");

            try {
                Thread.sleep(1000); // 1 second delay
            } catch (Exception e) {}
        }
    }

    public static void main(String[] args) {
        new Stopwatch();
    }
}