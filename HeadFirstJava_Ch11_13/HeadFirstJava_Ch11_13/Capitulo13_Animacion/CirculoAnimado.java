import javax.swing.*;
import java.awt.*;

public class CirculoAnimado extends JPanel {
    private int x = 0;

    public void moveCircle() {
        x += 5;
        if (x > getWidth()) {
            x = 0;
        }
        repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillOval(x, 100, 50, 50);
    }

    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Animated Circle");
        CirculoAnimado panel = new CirculoAnimado();
        frame.add(panel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        while (true) {
            panel.moveCircle();
            Thread.sleep(100);
        }
    }
}
