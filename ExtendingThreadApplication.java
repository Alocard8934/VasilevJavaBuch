package VasilevJavaBuch.Glava_12_MultiThread;

class MyThread extends Thread{
    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println("Untergeordneter Thread:\t" + i);
            try{
                Thread.sleep(4500);
            }catch(InterruptedException e){
                System.out.println("Unterbrechen eines untergeordneten Threads");
            }
        }
    }
}
public class ExtendingThreadApplication {
    public static void main(String[] args)throws InterruptedException {
        System.out.println("Die Programmausführung beginnt");
        MyThread t = new MyThread();
        System.out.println("Ein untergeordneter Thread wird gestartet");
        t.start();
        for(int k = 0; k <= 5; k++){
            System.out.println("Haupt Thread:\t" + (char)('A' + k));
            Thread.sleep(2000);
        }
        if(t.isAlive()){
            t.join();
        }
        System.out.println("Die Programmausführung ist abgeschlossen");
    }
}
