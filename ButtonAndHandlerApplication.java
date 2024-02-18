package VasilevJavaBuch.Glava_13_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyButton extends JButton implements ActionListener{
    public void actionPerformed(ActionEvent e){
        System.exit(0);
    }
    MyButton(int x, int y, int w, int h){
        super("Schließen Sie das Fenster");
        setBounds(x, y, w, h);
        setFocusPainted(false);
        addActionListener(this);
    }
}
class MyPanel extends JPanel{
    MyPanel(String txt, ImageIcon img){
        super();
        setBounds(5, 5, 285, 110);
        setBorder(BorderFactory.createEtchedBorder());
        setLayout(null);
        JLabel imgLbl = new JLabel(img);
        imgLbl.setBounds(10 , 10, 90, 90);
        imgLbl.setBorder(BorderFactory.createEtchedBorder());
        JLabel txtLbl = new JLabel(txt, JLabel.CENTER);
        txtLbl.setBounds(110, 10, 165, 90);
        txtLbl.setBorder(BorderFactory.createEtchedBorder());
        add(txtLbl);
        add(imgLbl);
    }
}
class MyFrame7 extends JFrame{
    MyFrame7(String name, String txt, ImageIcon img){
        super(name);
        setBounds(250, 250, 310, 200);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        MyPanel pnl = new MyPanel(txt, img);
        MyButton btn = new MyButton(50, 120, 200, 30);
        add(pnl);
        add(btn);
        setVisible(true);
    }
}
public class ButtonAndHandlerApplication {
    public static void main(String[] args) {
        ImageIcon img = new ImageIcon("C:\\Users\\yuriy\\Documents\\NetBeansProjects\\VideoCourse\\src\\VasilevJavaBuch\\Glava_13_GUI\\png\\pngwing.com.png");
        String txt = "<html>Es ist eine Giraffe.<br>Die ist Groß.<br>Sie sieht alles.</html>";
        new MyFrame7("Bearbeiter - Fensterobjekt", txt, img);
    }
}
