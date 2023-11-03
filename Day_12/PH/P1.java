import javax.swing.*;
import java.awt.event.*;

public class P1 extends JFrame {
  JLabel nameLabel, regNoLabel, cgpaLabel, genderLabel;
  JTextField nameTextField, regNoTextField, cgpaTextField;
  JCheckBox maleCheckBox, femaleCheckBox;
  JButton submitButton;

  P1() {
    super("Student Details");

    nameLabel = new JLabel("Name:");
    nameLabel.setBounds(50, 50, 100, 30);
    add(nameLabel);

    nameTextField = new JTextField();
    nameTextField.setBounds(150, 50, 200, 30);
    add(nameTextField);

    regNoLabel = new JLabel("Reg No:");
    regNoLabel.setBounds(50, 100, 100, 30);
    add(regNoLabel);

    regNoTextField = new JTextField();
    regNoTextField.setBounds(150, 100, 200, 30);
    add(regNoTextField);

    cgpaLabel = new JLabel("CGPA:");
    cgpaLabel.setBounds(50, 150, 100, 30);
    add(cgpaLabel);

    cgpaTextField = new JTextField();
    cgpaTextField.setBounds(150, 150, 200, 30);
    add(cgpaTextField);

    maleCheckBox = new JCheckBox("Male");
    maleCheckBox.setBounds(150, 200, 100, 30);
    add(maleCheckBox);

    femaleCheckBox = new JCheckBox("Female");
    femaleCheckBox.setBounds(250, 200, 100, 30);
    add(femaleCheckBox);

    submitButton = new JButton("Submit");
    submitButton.setBounds(150, 250, 100, 30);
    submitButton.addActionListener((e) -> onClickHandler(e));
    add(submitButton);

    setSize(400, 350);
    setLayout(null);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public void onClickHandler(ActionEvent e) {
    String name = nameTextField.getText();
    String regNo = regNoTextField.getText();
    String cgpa = cgpaTextField.getText();
    String gender = "";

    if (maleCheckBox.isSelected()) {
      gender = "Male";
    } else if (femaleCheckBox.isSelected()) {
      gender = "Female";
    }

    JOptionPane.showMessageDialog(this,
        "Welcome " + name + "!\nReg No: " + regNo + "\nCGPA: " + cgpa + "\nGender: " + gender);

  }

  public static void main(String[] args) {
    new P1();
  }
}
