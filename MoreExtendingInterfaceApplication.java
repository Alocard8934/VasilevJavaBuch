package VasilevJavaBuch;

interface First5{
    default void alpha(){
        System.out.println("First Interface: Alpha Methode()");
    }
}
interface Second5 extends First5{
    default void alpha(){
        First5.super.alpha();
        System.out.println("Bravo Interface: Alpha Methode()");
    }
    default void bravo(){
        System.out.println("Bravo Interface: Bravo Methode()");
    }
    
}
class MyClass5 implements Second5{
    public void bravo(){
        Second5.super.bravo();
        System.out.println("MyClass Classe: Bravo Methode()");
    }
}
public class MoreExtendingInterfaceApplication {
    public static void main(String[] args) {
        MyClass5 obj = new MyClass5();
        obj.alpha();
        obj.bravo();
    }
}
