package VasilevJavaBuch.Glava_12_MultiThread;
import java.util.Random;

class MyThread1 extends Thread{
    private int count;
    MyThread1(String name, int count){
        super(name);
        this.count = count;
        start();
    }
    public void run(){
        System.out.println("Ein Thread wird ausgeführt " + getName());
        Random rnd = new Random();
        for(int k = 1; k <= count; k++){
            System.out.println("Nachricht vom Thread " + getName() + ":\t" + getName().charAt(0) + k);
            try{
                Thread.sleep(1000 + rnd.nextInt(2001));
            }catch(InterruptedException e){
                System.out.println("Unterbrechung des Thread " + getName());
            }
        }
        System.out.println("Thread " + getName() + " ist abgeschlossen");
    }
}

public class MiltiThreadApplication {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Der Hauptthread beginnt zu laufen");
        MyThread1 A = new MyThread1("ALPHA", 5);
        MyThread1 B = new MyThread1("BRAVO", 3);
        MyThread1 C = new MyThread1("CHARLIE", 7);
        for(int k = 1; k <= 4; k++){
            System.out.println("Nachricht vom Hauptthread:\t" + k);
            Thread.sleep(2000);
        }
        if(A.isAlive()){
            A.join();
        }
        if(B.isAlive()){
            B.join();
        }
        if(C.isAlive()){
            C.join();
        }
        System.out.println("Hauptthread ist abgeschlossen");
    }
}
