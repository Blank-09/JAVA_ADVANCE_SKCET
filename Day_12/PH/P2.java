import javax.swing.*;

public class P2 extends JFrame {
  JLabel label1, label2, label3, label4;
  JTextField textField;
  JCheckBox checkBox1, checkBox2, checkBox3;

  public P2() {
    setTitle("IRC Trainer Feedback");
    setSize(450, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(null);

    label1 = new JLabel("Were the contents delivered clearly by the trainer:");
    label1.setBounds(20, 40, 300, 20);
    add(label1);

    label2 = new JLabel("Do the trainers clear all your doubts:");
    label2.setBounds(20, 80, 300, 20);
    add(label2);

    label3 = new JLabel("Do the trainer is interactive:");
    label3.setBounds(20, 120, 300, 20);
    add(label3);

    label4 = new JLabel("Rate the trainer on a scale of 1 to 10:");
    label4.setBounds(20, 160, 300, 20);
    add(label4);

    textField = new JTextField();
    textField.setBounds(330, 160, 50, 20);
    add(textField);

    checkBox1 = new JCheckBox("Yes");
    checkBox1.setBounds(330, 40, 50, 20);
    add(checkBox1);

    checkBox2 = new JCheckBox("No");
    checkBox2.setBounds(380, 40, 50, 20);
    add(checkBox2);

    checkBox3 = new JCheckBox("Yes");
    checkBox3.setBounds(330, 80, 50, 20);
    add(checkBox3);

    JCheckBox checkBox4 = new JCheckBox("No");
    checkBox4.setBounds(380, 80, 50, 20);
    add(checkBox4);

    JCheckBox checkBox5 = new JCheckBox("Yes");
    checkBox5.setBounds(330, 120, 50, 20);
    add(checkBox5);

    JCheckBox checkBox6 = new JCheckBox("No");
    checkBox6.setBounds(380, 120, 50, 20);
    add(checkBox6);

    JButton submitButton = new JButton("Submit");
    submitButton.setBounds(180, 220, 90, 30);
    add(submitButton);

    setVisible(true);
  }

  public static void main(String[] args) {
    new P2();
  }
}
