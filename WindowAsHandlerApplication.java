package VasilevJavaBuch.Glava_13_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame6 extends JFrame implements ActionListener{
    public void actionPerformed(ActionEvent e){
        System.exit(0);
    }
    MyFrame6(String name){
        super(name);
        setBounds(250 , 250, 310, 200);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        JPanel pnl = new JPanel();
        pnl.setBounds(5, 5, 285, 110);
        pnl.setBorder(BorderFactory.createEtchedBorder());
        pnl.setLayout(null);
        ImageIcon img = new ImageIcon("C:\\Users\\yuriy\\Documents\\NetBeansProjects\\VideoCourse\\src\\VasilevJavaBuch\\Glava_13_GUI\\png\\pngwing.com.png");
        String txt = "<html>Es ist eine Giraffe.<br>Die ist Groß.<br>Sie sieht alles.</html>";
        JLabel imgLbl = new JLabel(img);
        imgLbl.setBounds(10, 10, 90, 90);
        imgLbl.setBorder(BorderFactory.createEtchedBorder());
        JLabel txtLbl = new JLabel(txt, JLabel.CENTER);
        txtLbl.setBounds(110, 10, 165, 90);
        txtLbl.setBorder(BorderFactory.createEtchedBorder());
        JButton btn = new JButton("Schließen Sie das Fenster");
        btn.setBounds(50, 120, 200, 30);
        btn.setFocusPainted(false);
        btn.addActionListener(this);
        Font F = new Font(btn.getFont().getName(), Font.BOLD|Font.ITALIC, btn.getFont().getSize() + 2);
        txtLbl.setFont(F);
        pnl.add(imgLbl);
        pnl.add(txtLbl);
        add(pnl);
        add(btn);
        setVisible(true);                    
    }
}
public class WindowAsHandlerApplication {
    public static void main(String[] args) {
        new MyFrame6("Bearbeiter - Fensterobjekt");
    }
}
