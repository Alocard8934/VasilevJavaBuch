package VasilevJavaBuch;

interface First1{
    default void hello(){
    System.out.println("Method aus First Interface");
    }
}
interface Second1{
    default void hello(){
        System.out.println("Method aus Second Interface");
    }
}
class MyClass1 implements First1, Second1{
    public void hello(){
        First1.super.hello();
        Second1.super.hello();
    }
}
public class MoreDefaultMethodsApplication {
    public static void main(String[] args) {
        MyClass1 obj = new MyClass1();
        obj.hello();
    }
}
