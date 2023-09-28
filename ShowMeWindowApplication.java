package VasilevJavaBuch;

import javax.swing.JOptionPane;
public class ShowMeWindowApplication {
    public static void main(String[] args) {
        String title;
        String text;
        title = JOptionPane.showInputDialog(null, "Name für Fenster", "Name", JOptionPane.WARNING_MESSAGE);
        text = JOptionPane.showInputDialog(null, "Nachricht", "Inhalt", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, text, title, JOptionPane.INFORMATION_MESSAGE);
        
    }
}
