package Unit2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// wrong
class MyFrame extends JFrame implements ActionListener {
    Container c;
    JButton btn,btn2;
    MyFrame(){
        c  = this.getContentPane();
        c.setLayout(null);
        btn = new JButton("Click Me");
      btn2 = new JButton("Click Me");

        btn.setBounds(200,200,200,100);
        btn.setFont(new Font("Arial",Font.ITALIC,24));
        c.add(btn);
        btn2.setBounds(200,300,200,100);
        btn2.setFont(new Font("Arial",Font.ITALIC,24));
        c.add(btn2);
        btn.addActionListener(this);
        btn2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource()==btn){
        c.setBackground(Color.CYAN);
        }
        if(actionEvent.getSource()==btn2){
        c.setBackground(Color.RED);
        }
    }
}

public class ButtonAction {
    public static void main(String[] args) {
        MyFrame jf = new MyFrame();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
        jf.setBounds(500,300,800,600);
    }
}
