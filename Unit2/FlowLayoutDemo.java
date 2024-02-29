package Unit2;
/*
type of layout

1.Null Layout - When the component position def by us
2. Border Layout - Top, Down, left, right
3. Flow Layout - Arrange the component automatically
4. Grid Layout - Matrix
5. GridBag Layout - Like Grid + Resizable itself
6. Group Layout - Arrange group wise
7. Bax Layout - Box type
8. Card Layout - One at a time
*/

import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo {
    public static void main(String[] args) {

        JFrame frameObj = new JFrame();
        Font f = new Font("Arial",Font.BOLD,20);
        Container c = new Container();
        c= frameObj.getContentPane();
//        c.setLayout(null);

        // creating the buttons
        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");
        JButton b4 = new JButton("Button 4");
        JButton b5 = new JButton("Button 5");
        JButton b6 = new JButton("Button 6");
        JButton b7 = new JButton("Button 7");
        JButton b8 = new JButton("Button 8");
        JButton b9 = new JButton("Button 9");
        JButton b10 = new JButton("Button 10");
        b1.setFont(f);
        b2.setFont(f);
        b3.setFont(f);
        b4.setFont(f);
        b5.setFont(f);
        b6.setFont(f);
        b7.setFont(f);
        b8.setFont(f);
        b9.setFont(f);
        b10.setFont(f);

        // adding the buttons to frame
        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);
        c.add(b5);
        c.add(b6);
        c.add(b7);
        c.add(b8);
        c.add(b9);
        c.add(b10);
        FlowLayout fl = new FlowLayout(FlowLayout.CENTER,20,50);
        c.setLayout(fl);

        frameObj.setSize(800, 600);
        frameObj.setVisible(true);
    }
}
