import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GUI1 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Simple GUI Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(400, 200); // Set frame size
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Click the button");
        frame.add(label);

        JButton button = new JButton("Click Me");
        frame.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                label.setText("Button Clicked!");
            }
        });

        frame.setVisible(true);
    }
}