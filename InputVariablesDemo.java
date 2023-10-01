package VasilevJavaBuch;

import javax.swing.JOptionPane;
public class InputVariablesDemo {
    public static void main(String[] args) {
        int age, year, birth;
        String result;
        result = JOptionPane.showInputDialog("What year is it today?");
        year = Integer.parseInt(result);
        result = JOptionPane.showInputDialog("How old are you?");
        age = Integer.parseInt(result);
        birth = year - age;
        JOptionPane.showMessageDialog(null, "Were you born in " + birth + " year!");
    }
}
