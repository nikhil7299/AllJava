package Unit2;

import javax.swing.*;
import java.awt.*;

public class MyLabel {
    public  static  void main(String [] args){
        JFrame jf = new JFrame("Demo of JFrame");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBounds(500,300,800,600);
        Container container =jf.getContentPane();
        container.setBackground(Color.lightGray);
        ImageIcon imageIcon =new ImageIcon("/Users/Nikhil/Downloads/drivelogo.png");
        JLabel jLabel =new JLabel("User Name : ",imageIcon,JLabel.RIGHT);
        jLabel.setBounds(100,200,imageIcon.getIconWidth(),imageIcon.getIconHeight());
        container.add(jLabel);
        Font f  = new Font("calibri",Font.BOLD,35);
        jLabel.setFont(f);
        jf.setVisible(true);
    }
}
