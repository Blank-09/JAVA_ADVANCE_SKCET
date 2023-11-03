import javax.script.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class C3 {
  private static JTextField inputArea = new JTextField(12);
  private static JTextField outputArea = new JTextField("0", 12);

  private static ScriptEngineManager mgr = new ScriptEngineManager();
  private static ScriptEngine engine = mgr.getEngineByName("JavaScript");

  public static String calculate(String text) {
    try {
      return engine.eval(text).toString();
    } catch (ScriptException e) {
      return "Error";
    }
  }

  public static JButton createButton(String text) {
    JButton button = new JButton(text);
    button.setFont(new Font("Poppins", Font.BOLD, 24));
    button.setForeground(new Color(33, 53, 85));
    button.setBackground(new Color(205, 245, 253));
    button.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2, true));

    // Event Listener
    button.addActionListener(e -> {
      String buttonText = button.getText();
      String inputText = inputArea.getText();

      if (buttonText.equals("C")) {
        inputArea.setText("");
        outputArea.setText("0");
      } else if (buttonText.equals("CE")) {
        inputArea.setText("");
      } else if (buttonText.equals("=")) {
        if (inputText.length() > 0) {
          String result = calculate(inputText);
          outputArea.setText(result);
        }
      } else {
        if (inputText.equals("0") || inputText.equals("")) {
          inputArea.setText(buttonText);
        } else {
          inputArea.setText(inputText + buttonText);
        }
      }
    });

    return button;
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("Simple Calculator");

    JPanel mainPanel = new JPanel();
    mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
    frame.add(mainPanel);

    // Existing JTextField for input
    inputArea.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2, true));
    inputArea.setFont(new Font("Poppins", Font.PLAIN, 30));
    mainPanel.add(inputArea);

    mainPanel.add(Box.createVerticalStrut(10));

    // Create a new JPanel with a FlowLayout
    JPanel outputPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));

    JLabel label = new JLabel("=");
    label.setFont(new Font("Poppins", Font.PLAIN, 24));
    outputPanel.add(label);

    // New JTextField for output
    outputArea.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2, true));
    outputArea.setFont(new Font("Poppins", Font.PLAIN, 30));
    outputArea.setEditable(false); // Make the output screen read-only
    outputPanel.add(outputArea);

    // Add the outputPanel to the mainPanel
    mainPanel.add(outputPanel);

    mainPanel.add(Box.createVerticalStrut(10));

    // Keys panel
    JPanel keysPanel = new JPanel(new GridLayout(5, 4, 5, 5));
    mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    mainPanel.add(keysPanel);

    // Buttons Array
    JButton[] buttons = {
        createButton("+"),
        createButton("-"),
        createButton("*"),
        createButton("/"),
        createButton("7"),
        createButton("8"),
        createButton("9"),
        createButton("C"),
        createButton("4"),
        createButton("5"),
        createButton("6"),
        createButton("\u221A"),
        createButton("1"),
        createButton("2"),
        createButton("3"),
        createButton("%"),
        createButton("0"),
        createButton("."),
        createButton("="),
        createButton("CE")
    };

    for (JButton button : buttons) {
      keysPanel.add(button);
    }

    inputArea.addKeyListener(new KeyAdapter() {
      public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
          buttons[18].doClick();
        }
      }
    });

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setAlwaysOnTop(true);
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setResizable(false);
    frame.setVisible(true);
  }
}