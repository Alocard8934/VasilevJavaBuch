package VasilevJavaBuch;

import javax.swing.JOptionPane;
public class ShowMeNewWindowApplication {
    public static void main(String[] args) {
        String title = "Nachricht";
        String text = "Lerne weiterhin Java!";
        JOptionPane.showMessageDialog(null, text, title, JOptionPane.WARNING_MESSAGE);
    }
}

