package Unit2;

import javax.swing.*;
import java.awt.*;

public class MyRegistrationForm {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Demo of JFrame");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBounds(100,100,1000,800);
        Container container =jf.getContentPane();
        container.setBackground(Color.lightGray);
        container.setLayout(null);
        Font f = new Font("Arial", Font.BOLD,20);

        JLabel nameLabel = new JLabel("Name");
        nameLabel.setBounds(50,50,200,50);
        nameLabel.setFont(f);
        JTextField nameField = new JTextField();
        nameField.setBounds(250,50,300,50);
        nameField.setFont(f);

        JLabel passLabel = new JLabel("Password");
        passLabel.setBounds(50,100,200,50);
        passLabel.setFont(f);
        JPasswordField passField = new JPasswordField();
        passField.setBounds(250,100,300,50);
        passField.setEchoChar('*');
        passField.setFont(f);

        JLabel mobLabel = new JLabel("Moibile");
        mobLabel.setBounds(50,150,200,50);
        mobLabel.setFont(f);
        JTextField mobField = new JTextField();

        JLabel dobLabel = new JLabel("DOB");
        dobLabel.setBounds(50,200,200,50);
        dobLabel.setFont(f);
        // 2 combo box
        JLabel genderLabel = new JLabel("Gender");
        genderLabel.setBounds(50,250,200,50);
        genderLabel.setFont(f);
        // 3 combo box

        JLabel addressLabel = new JLabel("Address");
        addressLabel.setBounds(50,300,200,50);
        addressLabel.setFont(f);

        // checkbox
        JLabel termsLabel = new JLabel("By clicking this, you accept Terms and condition");
        termsLabel.setBounds(50,350,200,50);
        termsLabel.setFont(f);

        //button

        container.add(nameField);
        container.add(nameLabel);
        container.add(passField);
        container.add(passLabel);
        container.add(mobLabel);
        container.add(mobField);
        container.add(dobLabel);
        container.add(genderLabel);
        container.add(addressLabel);
        container.add(termsLabel);

        jf.setVisible(true);

    }
}
