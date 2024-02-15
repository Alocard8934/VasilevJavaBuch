package VasilevJavaBuch.Glava_13_GUI;

import javax.swing.JFrame;

class MyFrame extends JFrame{
    MyFrame(String name){
        super(name);
        setBounds(250, 250, 300, 200);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
public class SimpleWindowApplication {
    public static void main(String[] args) {
        new MyFrame("Normales Fenster");
    }
}
