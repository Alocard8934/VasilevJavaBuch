package VasilevJavaBuch;

import javax.swing.JOptionPane;
public class InpuDialogApplication {
    public static void main(String[] args) {
        String text;
        text=JOptionPane.showInputDialog("Geben Sie Text ein:");
        JOptionPane.showMessageDialog(null, "Sie haben diesen Text eingegeben:\n" + text);
    }
}
