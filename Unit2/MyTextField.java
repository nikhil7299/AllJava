package Unit2;

import javax.swing.*;
import java.awt.*;

public class MyTextField {

    public static void main(String[] args) {
        JFrame jf = new JFrame("Demo of JFrame");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBounds(500,300,1000,800);
        Container container =jf.getContentPane();
        container.setBackground(Color.lightGray);
        //
        container.setLayout(null);
        ImageIcon imageIcon =new ImageIcon("/Users/Nikhil/Downloads/drivelogo.png");
        JLabel jLabel =new JLabel("",imageIcon,JLabel.CENTER);
        jLabel.setBounds(300,20,imageIcon.getIconWidth(),imageIcon.getIconHeight());

        JLabel userNamelabel = new JLabel();
        userNamelabel.setBounds(100,400,200,50);
        userNamelabel.setText("UserName");
        JTextField jTextField = new JTextField();
        jTextField.setBounds(300,400,300,50);
//        jTextField.setText("Enter Username : ");
        Font f= new Font("Arial",Font.BOLD,30);
        jTextField.setFont(f);
        jTextField.setBackground(Color.WHITE);
        jTextField.setForeground(Color.MAGENTA);
//        jTextField.setEditable(false);
        //
        JLabel passwordLabel = new JLabel();
        passwordLabel.setBounds(100,500,200,50);
        passwordLabel.setText("Password :");

        JPasswordField jPassWordField = new JPasswordField();
        jPassWordField.setBounds(300,500,300,50);
        jPassWordField.setEchoChar('*');
        jPassWordField.setEchoChar((char)0);

        jPassWordField.setFont(f);
        jPassWordField.setBackground(Color.WHITE);
        jPassWordField.setForeground(Color.MAGENTA);
        container.add(userNamelabel);
        container.add(jTextField);
        container.add(passwordLabel);
        container.add(jPassWordField);
        container.add(jLabel);
        jf.setVisible(true);
    }
}
