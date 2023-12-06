import javax.swing.*;
import java.awt.*;


public class AppFrame extends JFrame {
    public AppFrame() { // What's public for???
        setTitle("My Java Project");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centers the window

        JLabel welcome = new JLabel("Welcome!"); // Label of the Frame
        welcome.setHorizontalAlignment(SwingConstants.CENTER); // Center horizontally
        welcome.setVerticalAlignment(SwingConstants.TOP); // Center in the TOP
        add(welcome);

        JTextField user_input = new JTextField(20);
        user_input.setPreferredSize(new Dimension(200, 30));
        add(user_input);

        setVisible(true); // Always in the bottom
    }
}
