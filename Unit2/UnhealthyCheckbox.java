package Unit2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UnhealthyCheckbox {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Check Box");
        jf.setBounds(100,100,1000,1000);
        Font f  = new Font("Arial",Font.BOLD,20);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = jf.getContentPane();
        c.setLayout(null);

        JCheckBox cbPizza = new JCheckBox("Pizza - 100");
        cbPizza.setFont(f);
        JCheckBox cbPaniPuri = new JCheckBox("Pani Puri - 50");
        cbPaniPuri.setFont(f);
        JCheckBox cbNoodles = new JCheckBox("Noodles - 120");
        cbNoodles.setFont(f);
        JCheckBox cbSamosa = new JCheckBox("Samosa - 15");
        cbSamosa.setFont(f);
        JCheckBox cbTea = new JCheckBox("Tea - 10");
        cbTea.setFont(f);


        JButton orderButton= new JButton("Place Order");
        orderButton.setFont(f);
//        orderButton.setBounds(100,600,300,50);

//
//        cbPizza.setBounds(100,100,300,50);
//        cbPaniPuri.setBounds(100,200,300,50);
//        cbNoodles.setBounds(100,300,300,50);
//        cbSamosa.setBounds(100,400,300,50);
//        cbTea.setBounds(100,500,300,50);

        JLabel totalLabel = new JLabel("Total :");
//        totalLabel.setBounds(500,100,100,50);
        totalLabel.setFont(f);

        c.add(cbPizza);
        c.add(cbPaniPuri);
        c.add(cbNoodles);
        c.add(cbSamosa);
        c.add(cbTea);
        c.add(orderButton);
        c.add(totalLabel);

        orderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int total = 0;
                if(cbPizza.isSelected()){
                    total +=100;
                }  if(cbPaniPuri.isSelected()){
                    total +=50;
                }  if(cbNoodles.isSelected()){
                    total +=120;
                }  if(cbSamosa.isSelected()){
                    total +=15;
                }  if(cbTea.isSelected()){
                    total +=10;
                }
                if(actionEvent.getSource() == orderButton) {
                    totalLabel.setText("Total : " + total);
                }
                System.out.println(total);
            }
        });
        FlowLayout fl = new FlowLayout(FlowLayout.LEFT,20,20);

        c.setLayout(fl);

        jf.setVisible(true);
    }
}
