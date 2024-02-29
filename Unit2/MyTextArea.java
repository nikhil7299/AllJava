package Unit2;

import javax.swing.*;
import java.awt.*;

public class MyTextArea {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setBounds(100,100,1000,800);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = jf.getContentPane();
        c.setLayout(null);

        JTextArea textArea =new JTextArea();
//        textArea.setBackground(Color.lightGray.brighter());
        textArea.setBounds(50,50,500,500);
        c.add(textArea);

        textArea.setFont(new Font("Roboto",Font.PLAIN,20));
        textArea.setLineWrap(true);
        //
        textArea.setEnabled(true);

        jf.setVisible(true);
    }
}
