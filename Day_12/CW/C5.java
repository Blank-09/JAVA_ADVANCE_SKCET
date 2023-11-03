// Create a Java Swing application that displays a list of items in a JList component. Allow the user to select an item from the list, and when a button is clicked, display a message dialog with the selected item's text.

import javax.swing.*;
import java.awt.*;

public class C5 {
  public static void main(String[] args) {
    // Create a JFrame
    JFrame frame = new JFrame("List Demo");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 300);

    // Create a JList with items
    String[] items = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
    JList<String> list = new JList<>(items);

    // Create a JButton to display the selected item
    JButton button = new JButton("Show Selected Item");
    button.addActionListener(e -> {
      // Get the selected item from the JList
      String selectedItem = list.getSelectedValue();

      // Display a message dialog with the selected item's text
      JOptionPane.showMessageDialog(frame, "You selected: " + selectedItem);

    });

    // Add the JList and JButton to the JFrame
    frame.add(new JScrollPane(list), BorderLayout.CENTER);
    frame.add(button, BorderLayout.SOUTH);

    // Display the JFrame
    frame.setVisible(true);
  }
}