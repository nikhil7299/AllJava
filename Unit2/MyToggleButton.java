package Unit2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ToggleButton extends JFrame implements ActionListener {
    Container c;
    JToggleButton toggleButton;
    public ToggleButton(){
        JFrame jf = new JFrame("Toggle Button Demo");
        jf.setBounds(100,100,800,600);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = jf.getContentPane();
        c.setLayout(null);
        Font f = new Font("Arial",Font.BOLD,20);
        toggleButton = new JToggleButton("Click Me");
        toggleButton.setBounds(200,200,200,50);
        c.add(toggleButton);
        jf.setVisible(true);
        toggleButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(toggleButton.isSelected()){
            c.setBackground(Color.CYAN);
            toggleButton.setText("Click for Blue");
        }
        else {
            c.setBackground(Color.blue);
            toggleButton.setText("Click for Cyan");
        }
    }
}

public  class MyToggleButton{
    public static void main(String[] args) {
        ToggleButton toggleButton = new ToggleButton();
    }
}
