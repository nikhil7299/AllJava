package Unit2;

import javax.swing.*;
import java.awt.*;


public class ScrollPaneDemo {

    public static void main(String[] args) {
        JFrame jf = new JFrame("Scroll Pane");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(800,600);
        jf.setLocationRelativeTo(null);
        jf.setLayout(new FlowLayout());

        String [] item = {
                "Tea","Coffee","Noodles","Burger","Pizza","Samosa","French Fries","Momos","CocaCola",};
        JList<String> list = new JList<>(item);
        JScrollPane jsp  = new JScrollPane();
        jsp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jsp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jf.add(jsp);
        jf.setVisible(true);
    }
}
