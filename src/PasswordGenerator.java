import javax.swing.*;
import java.awt.*;
public class PasswordGenerator extends JFrame {
    private final JTextField lengthField;
    private final JTextArea passwordArea;

    public PasswordGenerator() {
        setTitle("Random Password Generator");
        setSize(400, 200);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        JLabel lengthLabel = new JLabel("Enter the length of the password:");
        lengthField = new JTextField();
        JButton generateButton = new JButton("Generate Password");
        generateButton.setFocusable(false);
        passwordArea = new JTextArea();

        generateButton.addActionListener(_ -> generatePassword());

        panel.add(lengthLabel);
        panel.add(lengthField);
        panel.add(generateButton);
        add(panel, BorderLayout.NORTH);
        add(passwordArea, BorderLayout.CENTER);
    }

    private void generatePassword() {
        try {
            int length = Integer.parseInt(lengthField.getText());
            if (length < 8 || length > 16) {
                JOptionPane.showMessageDialog(this, "Password length must be in between 8 and 16");
                return;
            }
            passwordArea.setText(Generator.generateRandomPassword(length));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter a valid number.");
        }
    }
}
