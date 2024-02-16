package VasilevJavaBuch.Glava_13_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame5 extends JFrame{
    MyFrame5(String name){
        super(name);
        setBounds(250, 250, 300, 200);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        ImageIcon img = new ImageIcon("C:\\Users\\yuriy\\Documents\\NetBeansProjects\\VideoCourse\\src\\VasilevJavaBuch\\Glava_13_GUI\\png\\pngwing.com.png");
        String txt = "<html>Es ist eine Giraffe.<br>Die ist Groß.<br>Sie sieht alles.</html>";
        JLabel lbl = new JLabel(txt, img, JLabel.LEFT);
        Font F = new Font(Font.MONOSPACED, Font.BOLD, 14);
        lbl.setFont(F);
        lbl.setBounds(10, 30, 265, 80);
        lbl.setOpaque(true);
        lbl.setBackground(Color.LIGHT_GRAY);
        lbl.setBorder(BorderFactory.createEtchedBorder());
        add(lbl);
        JButton btn = new JButton("Schließen Sie das Fenster");
        btn.setBounds(50, 120, 200, 30);
        btn.setFocusPainted(false);
        btn.addActionListener(e -> {System.exit(0);});
        add(btn);
        setVisible(true);
    }

}
public class LambdaHandelApplication {
    public static void main(String[] args) {
        new MyFrame5("Lambda-Ausdruck");
    }
}
