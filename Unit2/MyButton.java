package Unit2;

import javax.swing.*;
import java.awt.*;

public class MyButton {

    public static void main(String[] args) {
        JFrame jf =new  JFrame("My Button");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBounds(100,100,1000,700);
        Container c = jf.getContentPane();
        c.setLayout(null);

        ImageIcon imageIcon =new ImageIcon("/Users/Nikhil/Downloads/button.png");

        Image image = imageIcon.getImage(); // transform it
        Image newimg = image.getScaledInstance(120, 120,  Image.SCALE_SMOOTH);
//        ImageIcon newImgIcon = new ImageIcon(newimg);
//        JButton jButton =new  JButton("Click Me");
        JButton jButton =new  JButton(imageIcon);
        jButton.setBounds(100,100,imageIcon.getIconWidth(),imageIcon.getIconHeight());
//        jButton.setMaximumSize();
        jButton.setBackground(Color.MAGENTA);
        jButton.setForeground(Color.gray);
        //jButton is enabled by default
//        jButton.setEnabled(false);
        Cursor csr = new Cursor(Cursor.WAIT_CURSOR);
        jButton.setCursor(csr);


        c.add(jButton);
        jf.setVisible(true);

    }
}
