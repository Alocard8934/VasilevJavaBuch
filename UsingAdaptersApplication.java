package VasilevJavaBuch.Glava_14_Obrabotka_Sobitij;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame4 extends JFrame{
    private JLabel L;
    private JTextField T;
    private JButton B;
    private String name = "Arial";
    private int size = 15;
    private String exit = "Schliessen";
    MyFrame4(){
        super("Fenster mit Textfeld");
        setBounds(250, 250, 300, 160);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        L = new JLabel();
        L.setBounds(10, 10, 265, 30);
        L.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent e){
                L.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
                L.setHorizontalAlignment(JLabel.RIGHT);
            }
           public void mouseExited(MouseEvent e){
               L.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
               L.setHorizontalAlignment(JLabel.LEFT);
           } 
        });
        T = new JTextField();
        T.setBounds(10, 50, 265, 30);
        T.addKeyListener(new KeyAdapter(){
            public void keyReleased(KeyEvent e){
                L.setText(T.getText());
            }
        });
        B = new JButton(exit);
        B.setBounds(60, 90, 175, 30);
        B.setFocusPainted(false);
        B.setFont(new Font(name, Font.PLAIN, size));
        B.setForeground(Color.BLUE);
        B.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        B.addMouseListener(new MouseAdapter(){
            public void mouseExited(MouseEvent e){
                B.setText(exit);
                B.setForeground(Color.BLUE);
                B.setFont(new Font(name, Font.PLAIN, size));
            }
            public void mouseEntered(MouseEvent e){
                B.setText("<html><u>" + exit + "</u></html>");
                B.setForeground(Color.RED);
                B.setFont(new Font(name, Font.BOLD, size + 2));
            }
        });
        add(L);
        add(T);
        add(B);
        setVisible(true);    
    }
}
public class UsingAdaptersApplication {
    public static void main(String[] args) {
        new MyFrame4();
    }
}
