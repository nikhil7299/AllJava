package Unit2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.HashMap;

public class ComboBoxDemo {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Check Box");
        jf.setSize(1000,800);
        jf.setLocationRelativeTo(null);
        Font f  = new Font("Arial",Font.BOLD,20);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container c = jf.getContentPane();
        jf.setLayout(null);

        String [] menu= {"Pepsi","CocaCola","Mirinda","7 Up","Sprite"};

        HashMap<String, Integer> menuMap = new HashMap<String, Integer>();
        menuMap.put("Pepsi",20);
        menuMap.put("Cocacola",10);
        menuMap.put("Mirinda",90);
        menuMap.put("7 Up",30);
        menuMap.put("Sprite",60);
        menuMap.put("Milk",50);

        JComboBox<String> jcb = new JComboBox<>( menuMap.keySet().toArray(new String[0]));
        jcb.setBounds(100,100,400,50);
        jcb.setFont(f);

//        jcb.addItem("Milk");
//        jcb.addItem("Coconut");
//        jcb.removeItem("Mirinda");
//        jcb.setEditable(false);
//        jcb.setSelectedItem("Milk");

        jcb.setSelectedIndex(2);
        JButton btn = new JButton("Get Item");
        btn.setBounds(120,150,200,50);
        btn.setFont(f);


        JLabel lbl = new JLabel("Selected Item : ");
        lbl.setBounds(120,200,600,50);
        lbl.setFont(f);

        JLabel lblPrice = new JLabel("Price of Item : ");
        lblPrice.setBounds(120,300,600,50);
        lblPrice.setFont(f);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
//                String s = jcb.getSelectedItem().toString();
//                lbl.setText("Selected Item : " +s);

                int index= jcb.getSelectedIndex();
                Object item = jcb.getSelectedItem();
//                System.out.println(item);
                lbl.setText("Selected index : "+index +" Drink : "+ item);
                lblPrice.setText("Price of the item : "+menuMap.get(item.toString()));
            }
        });
        c.add(jcb);
        c.add(lbl);
        c.add(btn);
        c.add(lblPrice);
        jf.setVisible(true);
    }
}
