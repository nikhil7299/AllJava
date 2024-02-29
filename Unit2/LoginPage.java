package Unit2;

import javax.swing.*;
import java.awt.*;

public class LoginPage {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Login Page");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
        jf.setLayout(null);
        jf.setBounds(500,300,800,600);
        Container container =jf.getContentPane();
        container.setBackground(Color.green);
        jf.setResizable(false);
    }

}
