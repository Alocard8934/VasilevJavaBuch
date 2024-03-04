package VasilevJavaBuch.Glava_15_GUI_Components;

import javax.swing.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ItemListener{
    private JComboBox CB;
    private JButton B;
    private JLabel L;
    private String[] animals = new String[]{"der Fuchs", "der Wolf", "der Bär", "der Waschbär"};
    private String[] files = new String[]{"fox.gif", "wolf.jpg", "bear.jpg", "racoon.jpg"};
    private String path = "C:\\Users\\yuriy\\Documents\\NetBeansProjects\\VideoCourse\\src\\VasilevJavaBuch\\Glava_15_GUI_Components\\img\\";
    private ImageIcon[] imgs;
    public void itemStateChanged(ItemEvent e){
        L.setIcon(imgs[CB.getSelectedIndex()]);
    }
    MyFrame(){
        super("Auswahlliste");
        setBounds(250, 250, 350, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        imgs = new ImageIcon[files.length];
        for(int k = 0; k < imgs.length; k++){
            imgs[k] = new ImageIcon(path + files[k]);
        }
        L = new JLabel(imgs[0]);
        L.setBounds(10, 10, 150, 100);
        add(L);
        JLabel lbl = new JLabel("Treffen Sie eine Auswahl");
        lbl.setBounds(170, 10, 120, 20);
        add(lbl);
        CB = new JComboBox(animals);
        CB.setBounds(170, 40, 120, 30);
        CB.setSelectedIndex(0);
        CB.addItemListener(this);
        add(CB);
        B  = new JButton("OK");
        B.setBounds(170, 80, 120, 30);
        B.addActionListener(e -> System.exit(0));
        add(B);
        setVisible(true);
    }
}

public class UsingComboBoxApplication {
    public static void main(String[] args) {
        new MyFrame();
    }
}
