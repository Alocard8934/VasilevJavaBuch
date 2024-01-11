package VasilevJavaBuch;

interface First{
    default void show(){
        System.out.println("First Interface: show Method()");
    }
}
interface Second{
    String getSecond();
    default void show(){
        System.out.println("Second Interface: show Method()");
    }    
}
class Base{
    String getBase(){
        return "Base Class";
    }
    void show(){
        System.out.println("Base Class: show Method()");
    }
}
class MyClass6 extends Base implements First, Second {
    public String getFirst(){
        return "First Interface";
    }
    public String getSecond(){
        return "Bravo Interface";
    }
 @Override
public void show() {
    System.out.println("Wir verwenden:");
    System.out.println(getFirst());
    System.out.println(getSecond());
    System.out.println(getBase());
    First.super.show();  // Explicitly call the show method from the First interface
    Second.super.show(); // Explicitly call the show method from the Second interface
    super.show();    
    }
}
public class ExtendingAndImplementingApplication {
    public static void main(String[] args) {
        MyClass6 obj = new MyClass6();
        obj.show(); // Вызов метода show() на экземпляре MyClass6
    }
}