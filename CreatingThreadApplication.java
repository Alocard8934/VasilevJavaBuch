package VasilevJavaBuch.Glava_12_MultiThread;

class MyThread implements Runnable{
    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println("Untergeordneter Thread:\t" + i);
            try{
                Thread.sleep(1200);
            }catch(InterruptedException e){
                System.out.println("Unterbrechen eines untergeordneten Threads");
            }
        }
    }
}
public class CreatingThreadApplication {
    public static void main(String[] args) {
        System.out.println("Die Programmausführung beginnt");
        Thread t = new Thread(new MyThread());
        System.out.println("Ein untergeordneter Thread wird gestartet");
        t.start();  
        for(int k = 0; k <= 5; k++){
            System.out.println("Haupt Thread:\t" + (char)('A' + k));
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                System.out.println("Unterbrechen des Hauptthreads");
            }
        }
        System.out.println("Die Programmausführung ist abgeschlossen");
    }
}
