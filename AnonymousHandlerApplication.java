package VasilevJavaBuch.Glava_13_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame4 extends JFrame {

    MyFrame4(String name) {
        super(name);
        setBounds(250, 250, 300, 200);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        JLabel lbl = new JLabel("Blauer Text", JLabel.CENTER);
        lbl.setBounds(10, 30, 260, 50);
        lbl.setForeground(Color.BLUE);
        lbl.setBorder(BorderFactory.createEtchedBorder());
        add(lbl);
        JButton btn = new JButton("Schließen Sie das Fenster");
        btn.setBounds(45, 120, 200, 30);
        btn.setFocusPainted(false);
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        add(btn);
        setVisible(true);
    }
}

public class AnonymousHandlerApplication {

    public static void main(String[] args) {
        new MyFrame4("Anonymer Betreuer");
    }
}
