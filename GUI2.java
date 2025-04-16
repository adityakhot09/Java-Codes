import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GUI2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("IntelliJ Swing Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(300, 200);
        JPanel panel = new JPanel();

        frame.add(panel);

        JLabel label = new JLabel("Enter text:");
        panel.add(label);

        JTextField textField = new JTextField(10);
        panel.add(textField);

        JButton button = new JButton("Submit");
        panel.add(button);

        JLabel resultLabel = new JLabel("");
        panel.add(resultLabel);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String inputText = textField.getText();

                resultLabel.setText("You entered: " + inputText);
            }
        });

        frame.setVisible(true);
    }
}