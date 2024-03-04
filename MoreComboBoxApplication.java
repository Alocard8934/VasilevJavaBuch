package VasilevJavaBuch.Glava_15_GUI_Components;

import javax.swing.*;
import java.awt.event.*;

class MyFrame2 extends JFrame{
    private JComboBox CB;
    private JButton B;
    private JLabel L;
    private String[] animals = new String[]{"der Fuchs", "der Wolf", "der Bär", "der Waschbär"};
    private String[] files = new String[]{"fox.jpg", "wolf.jpg", "bear.jpg", "racoon.jpg"};
    private String path = "C:\\Users\\yuriy\\Documents\\NetBeansProjects\\VideoCourse\\src\\VasilevJavaBuch\\Glava_15_GUI_Components\\img\\";
    private ImageIcon[] imgs;
    MyFrame2(){
        super("Auswahlliste");
        setBounds(250, 250, 315, 180);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        imgs = new ImageIcon[files.length];
        for(int k = 0; k < imgs.length; k++){
            imgs[k] = new ImageIcon(path + files[k]);
        }
        CB = new JComboBox(imgs);
        CB.setBounds(10, 10, 150, 100);
        CB.setSelectedIndex(0);
        CB.addItemListener(e -> L.setText(animals[CB.getSelectedIndex()]));
        add(CB);
        JLabel lbl = new JLabel("Ihre Auswahl:");
        lbl.setBounds(170, 10, 120, 20);
        add(lbl);
        L = new JLabel(animals[0], JLabel.CENTER);
        L.setBounds(170, 40, 120, 30);
        L.setBorder(BorderFactory.createEtchedBorder());
        add(L);
        B = new JButton("OK");
        B.setBounds(170, 80, 120, 30);
        B.addActionListener(e -> System.exit(0));
        add(B);
        setVisible(true);
    }
}
public class MoreComboBoxApplication {
    public static void main(String[] args) {
        new MyFrame2();
    }
}
