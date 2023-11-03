// 1. Create a Java Swing application that displays a simple window with a button. When the button is clicked, display a message dialog with the text "Hello, Swing!".

import javax.swing.*;

public class C1 {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Hello, Swing!");
    JButton button = new JButton("Click Me!");

    button.addActionListener(e -> {
      JOptionPane.showMessageDialog(frame, "Hello, Swing!");
    });

    frame.add(button);
    frame.setSize(480, 360);
    frame.setVisible(true);
  }
}
