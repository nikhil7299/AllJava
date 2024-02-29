package Unit2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonAction2 {

    public static void main(String[] args) {
        JFrame jf = new JFrame("Demo of JFrame");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
        jf.setLayout(null);


        jf.setBounds(500,300,800,600);
        Container container =jf.getContentPane();
//        container.setBackground(Color.green);

        JButton btn = new JButton("Click");
        btn.setBounds(100,100,200,80);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                container.setBackground(Color.MAGENTA);
            }
        });
        btn.addActionListener(actionEvent -> container.setBackground(Color.MAGENTA));
        container.add(btn);
        jf.setResizable(false);
    }
}
