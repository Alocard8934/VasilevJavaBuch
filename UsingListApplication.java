package VasilevJavaBuch.Glava_15_GUI_Components;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

class MyFrame3 extends JFrame implements ListSelectionListener{
    private JList LS;
    private JButton B;
    private JLabel L;
    private String[] animals = new String[]{"der Fuchs", "der Wolf", "der Bär", "der Waschbär"};
    private String[] files = new String[]{"fox.jpg", "wolf.jpg", "bear.jpg", "racoon.jpg"};
    private String path = "C:\\Users\\yuriy\\Documents\\NetBeansProjects\\VideoCourse\\src\\VasilevJavaBuch\\Glava_15_GUI_Components\\img\\";
    private ImageIcon[] imgs;
    public void valueChanged(ListSelectionEvent e){
        L.setIcon(imgs[LS.getSelectedIndex()]);
    }
    MyFrame3(){
        super("Auswahlliste");
        setBounds(250, 250, 340, 200);
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
        JLabel lbl = new JLabel("Treffen Sie eine Auswahl:");
        lbl.setBounds(170, 10, 120, 20);
        add(lbl);
        LS = new JList(animals);
        LS.setBounds(170, 35, 120, 75);
        LS.addListSelectionListener(this);
        LS.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        LS.setSelectedIndex(0);
        add(LS);
        B = new JButton("OK");
        B.setBounds(90, 120, 120, 30);
        B.addActionListener(e -> System.exit(0));
        add(B);
        setVisible(true);
    }
}
public class UsingListApplication {
    public static void main(String[] args) {
        new MyFrame3();
    }
}
