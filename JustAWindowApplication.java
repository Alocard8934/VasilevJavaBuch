package VasilevJavaBuch.Glava_13_GUI;
import javax.swing.JFrame;

public class JustAWindowApplication {
    public static void main(String[] args) {
        JFrame wnd = new JFrame("Normales Fenster");
        wnd.setSize(300, 200);
        wnd.setLocation(250, 250);
        wnd.setResizable(false);
        wnd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        wnd.setVisible(true);
    }
}
