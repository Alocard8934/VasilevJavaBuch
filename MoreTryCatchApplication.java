package VasilevJavaBuch.Glava_11_Iskluchitelniye_Situacii;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class MoreTryCatchApplication {
    public static void main(String[] args) {
        String input;
        char[] symbs;
        int size, index;
        input = showInputDialog(null, "Größe des Arrays angeben", "Zeichenarray", QUESTION_MESSAGE);
        try{
            size = parseInt(input);
            symbs = new char[size];
            String txt = "| ";
            for(int k = 0; k < size; k++){
                symbs[k] = (char)('A' + k);
                txt += symbs[k] + " | ";
            }
            showMessageDialog(null, txt, "Zeichen aus einem Array", INFORMATION_MESSAGE);
            input = showInputDialog(null, "Geben Sie den Index des Elements an", "Der Index eines Arrayelements", QUESTION_MESSAGE);
            index = parseInt(input);
            txt = "Index -" + index + "\nSymbol -" + symbs[index];
            showMessageDialog(null, txt, "Symbol", INFORMATION_MESSAGE);
        }catch(NumberFormatException e){
            showMessageDialog(null, "Leider ist ein Fehler aufgetreten....", "Fehler", WARNING_MESSAGE);
        }catch(NegativeArraySizeException e){
            showMessageDialog(null, "Falsche Array-Größe", "Fehler beim Erstellen des Arrays", ERROR_MESSAGE);
        }catch(ArrayIndexOutOfBoundsException e){
            showMessageDialog(null, "Sind Sie sicher? Es gibt kein solches Element!", "Fehler bei der Indexauswahl", QUESTION_MESSAGE);
        }
    }
}
    

