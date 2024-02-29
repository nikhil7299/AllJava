package Unit2;

import javax.swing.*;
import java.awt.*;

public class JFrameDemo {
    public  static  void main(String [] args){
        JFrame jf = new JFrame("Demo of JFrame");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
//        jf.setSize(2000,1000);
//        jf.setLocation(400,400);
        jf.setBounds(500,300,800,600);
        ImageIcon imageIcon =new ImageIcon("~/Downloads/drivelogo.png");
        jf.setIconImage(imageIcon.getImage());
        Container container =jf.getContentPane();
        container.setBackground(Color.green);
        jf.setResizable(false);
    }
}
