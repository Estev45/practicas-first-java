import javax.swing.*;

public class SimpleWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Window");
        JButton button = new JButton("Click me!");

        button.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Hello from Swing!"));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
