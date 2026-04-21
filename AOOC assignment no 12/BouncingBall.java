import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BouncingBall extends JPanel implements Runnable, MouseListener {

    int x = 50, y = 50;      // Ball position
    int dx = 2, dy = 2;      // Direction
    Thread t;

    public BouncingBall() {
        addMouseListener(this);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLUE);
        g.fillOval(x, y, 30, 30);  // Draw ball
    }

    public void run() {
        while (true) {
            x += dx;
            y += dy;

            // Bounce from walls
            if (x <= 0 || x >= getWidth() - 30)
                dx = -dx;

            if (y <= 0 || y >= getHeight() - 30)
                dy = -dy;

            repaint();

            try {
                Thread.sleep(10);
            } catch (Exception e) {}
        }
    }

    public void mousePressed(MouseEvent e) {
        if (t == null) {
            t = new Thread(this);
            t.start();
        }
    }

    // Unused methods
    public void mouseClicked(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    public static void main(String[] args) {
        JFrame f = new JFrame("Bouncing Ball");
        BouncingBall b = new BouncingBall();

        f.add(b);
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}