package VasilevJavaBuch;

import javax.swing.JOptionPane;
public class UsingVariablesDemo {
    public static void main(String[] args) {
        int number = 123;
        double x = 32.1;
        char symb = 'A';
        boolean state = true;
        
        String text = "Variables used:\n";
        text = text + "Integer: " + number + "\n";
        text = text + "Real number: " + x + "\n";
        text = text + "Symbol: " + symb + "\n";
        text = text + "Boolean value: " + state;
        JOptionPane.showMessageDialog(null, text);
    }
}
