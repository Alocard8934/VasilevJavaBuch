package VasilevJavaBuch;

interface Base1{
    default void show(String txt){
        System.out.println("Bases Interface: " + txt);
    }
    void hello();
}
class Alpha7 implements Base1{
    public void hello(){
        System.out.println("Object Alphas Class");
    }
    public void show(String txt){
        System.out.println("Alpha Classe: " + txt);
    }
}

class Bravo7 implements Base1{
    public void hello(){
        System.out.println("Bravos Classe");
    }
}
public class UsingDefaultMethodsApplication {
    public static void main(String[] args) {
        Base1 ref;
        Alpha7 objA = new Alpha7();
        objA.hello();
        objA.show("Objektvariable objA");
        ref = objA;
        ref.show("InterfaceVariable ref");
        Bravo7 objB = new Bravo7();
        objB.hello();
        objB.show("Objektvariable objB");
        ref = objB;
        ref.show("InterfaceVariable ref");
    }
}
