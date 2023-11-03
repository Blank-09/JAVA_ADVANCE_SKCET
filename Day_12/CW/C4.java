import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class C4 {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Color Choosers");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Create a panel
    JPanel panel = new JPanel();
    panel.setPreferredSize(new Dimension(200, 200));

    // Create a dropdown with color options
    String[] colors = { "Red", "Green", "Blue", "Yellow", "Orange", "Pink", "Magenta" };

    JComboBox<String> colorDropdown = new JComboBox<>(colors);

    // Add an action listener to the dropdown
    colorDropdown.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String selectedColor = (String) colorDropdown.getSelectedItem();
        switch (selectedColor) {
          case "Red":
            panel.setBackground(Color.RED);
            break;
          case "Green":
            panel.setBackground(Color.GREEN);
            break;
          case "Blue":
            panel.setBackground(Color.BLUE);
            break;
          case "Yellow":
            panel.setBackground(Color.YELLOW);
            break;
          case "Orange":
            panel.setBackground(Color.ORANGE);
            break;
          case "Pink":
            panel.setBackground(Color.PINK);
            break;
          case "Magenta":
            panel.setBackground(Color.MAGENTA);
            break;
        }
      }
    });

    // Add the dropdown and panel to the frame
    frame.add(colorDropdown, BorderLayout.NORTH);
    frame.add(panel, BorderLayout.CENTER);

    frame.setSize(300, 300);
    frame.setVisible(true);
  }
}