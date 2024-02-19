package VasilevJavaBuch.Glava_14_Obrabotka_Sobitij;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;

class MyFrame2 extends JFrame implements ActionListener, MouseListener{
    private JLabel L;
    private JTextField T;
    private String apply = "Anwenden";
    private String exit = "Schließen";
    public void actionPerformed(ActionEvent e){
        String txt = e.getActionCommand();
        if(txt.equals(apply)){
            L.setText(T.getText());
        }else{
            System.exit(0);
        }
    }
    public void mouseExited(MouseEvent e){
        L.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        L.setHorizontalAlignment(JLabel.LEFT);
    }
    public void mouseEntered(MouseEvent e){
        L.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        L.setHorizontalAlignment(JLabel.RIGHT);
    }
    public void mouseReleased(MouseEvent e){}
    public void mousePressed(MouseEvent e){}
    public void mouseClicked(MouseEvent e){}
    MyFrame2(){
        super("Fenster mit Textfeld");
        int w = 310, h = 170;
        setBounds(250, 250, w, h);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        L = new JLabel();
        L.setBounds(10, 10, w - 35, 30);
        L.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        L.addMouseListener(this);
        T = new JTextField();
        T.setBounds(L.getX(), 50, L.getWidth(), 30);
        int bw = (T.getWidth() - 30) / 2;
        JButton appB = new JButton(apply);
        appB.setBounds(T.getX(), 90, bw, 30);
        appB.setFocusPainted(false);
        appB.addActionListener(this);
        JButton extB = new JButton(exit);
        extB.setBounds(appB.getX() + appB.getWidth() + 20, appB.getY(), appB.getWidth(), appB.getHeight());
        extB.setFocusPainted(false);
        extB.addActionListener(this);
        add(L);
        add(T);
        add(appB);
        add(extB);
        setVisible(true);
    }
}
public class MoreTextFieldApplication {
    public static void main(String[] args) {
        new MyFrame2();
    }
}
