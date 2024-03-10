package VasilevJavaBuch.Glava_18_Argumenti;
import static javax.swing.JOptionPane.*;

public class GetMoneyApplication {
    public static void main(String[] args) {
        String name;
        double m;
        double r;
        int t;
        double val;
        try{
            name = args[0] + " " + args[1];
            m = Double.parseDouble(args[2]);
            r = Double.parseDouble(args[3]);
            t = Integer.parseInt(args[4]);
            val = m;
            for(int k = 1; k <= t; k++){
                val *= (1 + r / 100);
            }
            val = ((int)(100 * val))/ 100.0;
            String txt = "Name:  " + name + "\n";
            txt += "Beitrag:  " + m + "\n";
            txt += "Zinssatz:  " + r + "\n";
            txt += "Zeit:  " + t + "\n";
            txt += "Unterm Strich:  " + val;
            showMessageDialog(null, txt, "Gesamtbetrag der Einlage", INFORMATION_MESSAGE);
        }catch(Exception e){
            showMessageDialog(null, "Falsche Einstellungen!\n" + e, "Fehler", ERROR_MESSAGE);
        }
    }
}
