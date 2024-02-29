package Unit2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class MyFrame2 extends JFrame implements ActionListener
{
    Container c;
    JMenuBar menubar;
    JMenu file,edit;
    JMenuItem f1,f2,f3,e1,e2,e3,e4,e5;
    JTextArea ta;
    MyFrame2()
    {
        setSize(800,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        c=getContentPane();
        c.setLayout(null);
// Menubar
        menubar=new JMenuBar();
//Menus
        file=new JMenu("File");
// MenuItem
        f1=new JMenuItem("new");
        f2=new JMenuItem("open");
        f3=new JMenuItem("save");

//adding menu item added with menus
        file.add(f1);
        file.add(f2);
        file.add(f3);

        f1.addActionListener(this);
//menus added with menubar
        menubar.add(file);
        setJMenuBar(menubar);



        edit=new JMenu("Edit");
// MenuItem
        e1=new JMenuItem("cut");
        e2=new JMenuItem("copy");
        e3=new JMenuItem("paste");
        e4=new JMenuItem("delete");
        e5=new JMenuItem("selectAll");

        edit.add(e1);
        edit.add(e2);
        edit.add(e3);
        edit.add(e4);
        edit.add(e5);

        menubar.add(edit);
        setJMenuBar(menubar);


        ta=new JTextArea(10,50);
        ta.setBounds(10,10,700,500);
        ta.setFont(new Font("a",Font.PLAIN,34));
        c.add(ta);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==f1)
            ta.setText("");
        if(e.getSource()==f2)
            ta.setText("Open...... ");
        if(e.getSource()==f3)
            ta.setText("Save...... ");
        if(e.getSource()==e1)
            ta.cut();
        if(e.getSource()==e2)
            ta.copy();
        if(e.getSource()==e3)
            ta.paste();
        if(e.getSource()==e4)
            ta.setText("");
        if(e.getSource()==e5)
            ta.selectAll();

    }
}

public class MyMenuBar
{
    Container c;
    public static void main(String[] args) {
        new MyFrame2();
    }
}