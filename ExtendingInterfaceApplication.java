package VasilevJavaBuch;

interface First3{
    default void alpha(){
        System.out.println("First Interface: Alpha Method()");
    }
    default void bravo(){
        System.out.println("First Interface: Bravo Method()");
    }
    default void charlie(){
        System.out.println("First Interface: Charlie Method()");
    }
    void delta();
}

interface Second3 extends First3{
    void bravo();
    default void charlie(){
        System.out.println("Second Interface: Charlie Method()");
    }
    void echo();
}
class MyClass3 implements Second3{
    public void bravo(){
        System.out.println("MyClass Classe: Bravo Method()");
    }
    public void delta(){
        System.out.println("MyClass Classe: Delta Method()");
    }
    public void echo(){
        System.out.println("MyClass Classe: Echo Method()");
    }
}
public class ExtendingInterfaceApplication {
    public static void main(String[] args) {
        MyClass3 obj = new MyClass3();
        obj.alpha();
        obj.bravo();
        obj.charlie();
        obj.delta();
        obj.echo();
    }
}
