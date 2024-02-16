package VasilevJavaBuch.Glava_13_GUI;

import javax.swing.*;
import java.awt.event.*;

class MyFrame3 extends JFrame{
    MyFrame3(){
        super("Fenster mit Taste");
        setBounds(250, 250, 300, 200);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        JLabel lbl = new JLabel("Mit einem Klick auf die Taste wird das Fenster geschlossen");
        lbl.setBounds(10, 30, 280, 50);
        add(lbl);
        JButton btn = new JButton("Schließen Sie das Fenster");
        btn.setBounds(50, 120, 200, 30);
        MyHandler hnd = new MyHandler();
        btn.addActionListener(hnd);
        add(btn);
        setVisible(true);
    }
}
class MyHandler implements ActionListener{
    public void actionPerformed(ActionEvent e){
        System.exit(0);
    }
}
public class WindowWithButtonApplication {
    public static void main(String[] args) {
        new MyFrame3();
    }
}
