package VasilevJavaBuch;

import javax.swing.JOptionPane;
public class InputDoubleVariablesDemo {
    public static void main(String[] args) {
        double mass, height, bmi;
        String result;
        result = JOptionPane.showInputDialog("Enter your height in meters:");
        height = Double.parseDouble(result);
        result = JOptionPane.showInputDialog("Enter your weight in kilograms:");
        mass = Double.parseDouble(result);
        bmi = mass / height / height;
        bmi = Math.round(bmi*100)/100.0;
        JOptionPane.showMessageDialog(null, "Body mass index is: " + bmi);
    }
}
