package Unit2;

import javax.swing.*;
import java.awt.*;

public class MyCheckBox {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Check Box");
        jf.setBounds(100,100,1000,800);
        Font f  = new Font("Arial",Font.BOLD,20);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = jf.getContentPane();
        c.setLayout(null);

        // Use Grid Layout
        JCheckBox cbHS = new JCheckBox("High School");
        JCheckBox cbI = new JCheckBox("Intermediate");
        JCheckBox cbUG = new JCheckBox("Under Graduate");
        JCheckBox cbPG = new JCheckBox("Post Graduate");
        JCheckBox cbPHD = new JCheckBox("Ph. D");

//        cbHS.setBounds(100,100,300,50);
//        cbI.setBounds(100,100,300,50);
//        cbHS.setBounds(100,100,300,50);
//        cbHS.setBounds(100,100,300,50);
//        cbHS.setBounds(100,100,300,50);

        c.add(cbHS);
        c.add(cbI);
        c.add(cbUG);
        c.add(cbPG);
        c.add(cbPHD);

        jf.setVisible(true);
    }
}
