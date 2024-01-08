package VasilevJavaBuch;

interface First{
    void hello();
}
interface Second{
    void hi();
}

class MyClass implements First, Second{
    public void hello(){
        System.out.println("Methode aus der ersten Schnittstelle");
    }
    public void hi(){
            System.out.println("Methode aus der zweiten Schnittstelle");
    }
}
public class UsingInterfacesApplication {
    public static void main(String[] args) {
    MyClass obj = new MyClass();

        obj.hello();
        obj.hi();
    }
}
