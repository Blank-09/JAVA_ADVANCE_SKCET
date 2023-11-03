// Create a Java Swing application that has a text field and a button. When the button is clicked, retrieve the text entered in the text field and display it in a message dialog.

import javax.swing.*;
import java.awt.*;

public class C2 {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Message Dialog");
    JPanel panel = new JPanel(new GridLayout(0, 1, 10, 10));

    panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));

    JTextField textBox = new JTextField(15);
    JButton button = new JButton("Submit");

    button.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Text: " + textBox.getText()));

    panel.add(textBox);
    panel.add(button);
    frame.add(panel);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new GridLayout(0, 1));
    frame.setSize(300, 200);
    frame.setVisible(true);
  }
}
