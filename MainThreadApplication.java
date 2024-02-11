package VasilevJavaBuch.Glava_12_MultiThread;


public class MainThreadApplication {
    public static void main(String[] args) {
        Thread t;
        t = Thread.currentThread();
        System.out.println(t);
        t.setName("Haupt Thread");
        t.setPriority(7);
        System.out.println(t);
    }
}
