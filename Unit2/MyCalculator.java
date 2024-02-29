package Unit2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Calculator extends JFrame implements ActionListener {

    Container c;
    JLabel label1,label2,labelResult;
    JTextField txt1,txt2;
    JButton add, sub, mul,div;

    Calculator(){
        setTitle("My Calculator");
        setBounds(100,100,800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        c = getContentPane();
        c.setLayout(null);
        // set label
        Font f = new Font("Arial",Font.BOLD,20);
        label1 = new JLabel("First Number");
        label1.setBounds(50,50,200,50);
        label1.setFont(f);
        c.add(label1);

        label2 = new JLabel("Second Number");
        label2.setBounds(50,150,200,50);
        label2.setFont(f);
        c.add(label2);

        txt1 = new JTextField();
        txt1.setBounds(250,50,150,50);
        txt1.setFont(f);
        c.add(txt1);

        txt2 = new JTextField();
        txt2.setBounds(250,150,150,50);
        txt2.setFont(f);
        c.add(txt2);

        add = new JButton("Add +");
        add.setBounds(50,250,100,50);
        add.setFont(f);
        add.addActionListener(this);
        c.add(add);

        sub = new JButton("Sub -");
        sub.setBounds(150,250,100,50);
        sub.setFont(f);
        sub.addActionListener(this);
        c.add(sub);

        mul = new JButton("Mul *");
        mul.setBounds(250,250,100,50);
        mul.setFont(f);
        mul.addActionListener(this);

        c.add(mul);

        div = new JButton("Div %");
        div.setBounds(350,250,100,50);
        div.setFont(f);
        div.addActionListener(this);
        c.add(div);

        labelResult = new JLabel("Result : ");
        labelResult.setBounds(50,350,600,50);
        labelResult.setFont(f);
        c.add(labelResult);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        try {
            int x = Integer.parseInt(txt1.getText());
            int y = Integer.parseInt(txt2.getText());

            if (actionEvent.getSource() == add) {
                labelResult.setText("Result : " + (x + y));

            }
            if (actionEvent.getSource() == sub) {
                labelResult.setText("Result : " + (x - y));

            }
            if (actionEvent.getSource() == mul) {
                labelResult.setText("Result : " + (x * y));

            }
            if (actionEvent.getSource() == div) {
                labelResult.setText("Result : " + (x / y));

            }
        }catch (NumberFormatException e){
            labelResult.setText("Result : Exception : Enter Numeric Value Only");
        }
        catch (ArithmeticException e){
            labelResult.setText("Result : Exception : Enter Value Greater Than 0 in Field 2");
        }
    }
}

public class MyCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

    }
}
