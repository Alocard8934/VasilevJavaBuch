package VasilevJavaBuch.Glava_14_Obrabotka_Sobitij;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;

class MyFrame extends JFrame{
    private JLabel L;
    private JTextField T;
    MyFrame(){
        super("Fenster mit Textfeld");
        int w = 330, h = 170;
        setBounds(250, 250, w, h);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        L = new JLabel();
        L.setBounds(10, 10, w - 35, 30);
        L.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        T = new JTextField();
        T.setBounds(L.getX(), 50, L.getWidth(), 30);
        int bw = (T.getWidth() - 20 ) / 2;
        JButton appB = new JButton("Anwenden");
        appB.setBounds(T.getX(), 90, bw, 30);
        appB.setFocusPainted(false);
        appB.addActionListener(e -> L.setText(T.getText()));
        JButton extB = new JButton("Schließen");
        extB.setBounds(appB.getX() + appB.getWidth() + 20, appB.getY(), appB.getWidth(), appB.getHeight());
        extB.setFocusPainted(false);
        extB.addActionListener(e -> System.exit(0));
        add(L);
        add(T);
        add(appB);
        add(extB);
        setVisible(true);
    }
}
public class TextFieldApplication {
    public static void main(String[] args) {
        new MyFrame();
    }
}
