package Unit2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class RedClass implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        ButtonAction3.c.setBackground(Color.red);

    }
}class YellowClass implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        ButtonAction3.c.setBackground(Color.yellow);

    }
}class GreenClass implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        ButtonAction3.c.setBackground(Color.green);

    }
}

public class ButtonAction3 {
    public static  Container c;
    public static void main(String[] args) {

        JFrame jf = new JFrame( "Button Action 3");
        jf.setBounds(100,100,800,600);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         c=jf.getContentPane();
        c.setLayout(null);

        JButton btnRed = new JButton("RED");
        JButton btnYellow = new JButton("YELLOW");
        JButton btnGreen = new JButton("GREEN");

        btnRed.setBounds(100,50,100,60);
        btnYellow.setBounds(250,50,100,60);
        btnGreen.setBounds(400,50,100,60);

        c.add(btnRed);
        c.add(btnYellow);
        c.add(btnGreen);

        btnRed.addActionListener(new RedClass());
        btnYellow.addActionListener(new YellowClass());
        btnGreen.addActionListener(new GreenClass());

        jf.setVisible(true);

    }
}
