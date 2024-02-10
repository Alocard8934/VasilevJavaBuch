package VasilevJavaBuch.Glava_12_MultiThread;

public class NewThreadApplication {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Die Programmausführung beginnt");
        Thread t = new Thread(new Runnable(){
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
        });
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
