package Unit2;

import javax.swing.*;
import java.awt.*;

public class MyRadioButton {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Radio Button");
        jf.setBounds(100,100,1000,800);
        Font f  = new Font("Arial",Font.BOLD,20);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = jf.getContentPane();
        c.setLayout(null);

        JRadioButton rbMale =new JRadioButton("Male");
        rbMale.setBounds(100,100,200,50);
        rbMale.setFont(f);

        JRadioButton rbFemale  =new JRadioButton("Female");
        rbFemale.setBounds(300,100,200,50);
        rbFemale.setFont(f);

        ButtonGroup gender =  new ButtonGroup();
        gender.add(rbMale);
        gender.add(rbFemale);
        rbMale.setSelected(true);

        JRadioButton rbGeneral = new JRadioButton("General");
        rbGeneral.setBounds(100,200,150,50);
        rbGeneral.setFont(f);
        JRadioButton rbOBC = new JRadioButton("OBC");
        rbOBC.setBounds(250,200,150,50);
        rbOBC.setFont(f);
        JRadioButton rbSC = new JRadioButton("SC");
        rbSC.setBounds(400,200,150,50);
        rbSC.setFont(f);
        JRadioButton rbST = new JRadioButton("ST");
        rbST.setBounds(550,200,150,50);
        rbST.setFont(f);
        JRadioButton rbOther = new JRadioButton("Other");
        rbOther.setBounds(700,200,150,50);
        rbOther.setFont(f);

        //Try Using Grid Layout

        ButtonGroup cast =new ButtonGroup();
        rbGeneral.setSelected(true);
        cast.add(rbGeneral);
        cast.add(rbOBC);
        cast.add(rbSC);
        cast.add(rbST);
        cast.add(rbOther);


        c.add(rbMale);
        c.add(rbFemale);
        c.add(rbGeneral);
        c.add(rbOBC);
        c.add(rbST);
        c.add(rbSC);
        c.add(rbOther);

        jf.setVisible(true);
    }
}
