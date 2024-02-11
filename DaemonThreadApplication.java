package VasilevJavaBuch.Glava_12_MultiThread;
import static javax.swing.JOptionPane.*;

public class DaemonThreadApplication {
    public static void main(String[] args)throws InterruptedException {
        Thread t = new Thread(() -> {
            int k = 1, s = 0;
            while(true){
                System.out.println(Thread.currentThread().getName() + ": " + s);
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){}
                s += k;
                k++;
            }
        }, "Berechnung der Summe");
        t.setDaemon(true);
        int res;
        t.start();
        do{
            Thread.sleep(3000);
            res = showConfirmDialog(null, "Soll ich die Berechnung der Summe beenden?", "Summe der Zahlen", YES_NO_OPTION);
        }while(res != YES_OPTION);
    }
}
