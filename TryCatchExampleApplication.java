package VasilevJavaBuch.Glava_11_Iskluchitelniye_Situacii;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class TryCatchExampleApplication {
    public static void main(String[] args) {
        String input;
        int num;
        input = showInputDialog(null, "Geben Sie Zahl ein", "Zahl", QUESTION_MESSAGE);
        try{
            num = parseInt(input);
            showMessageDialog(null, "Die Zahlen " + (num - 1) + ", " + num + " und " + (num + 1), "Zahlen", INFORMATION_MESSAGE);
        }catch(Exception e){
            showMessageDialog(null, "Etwas ist schief gelaufen....", "Das Fehler", ERROR_MESSAGE);
        }
    }
}
