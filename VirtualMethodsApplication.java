package VasilevJavaBuch;

class Alpha3{
    String name;
    void objectCreated(){
        System.out.println("Alphas Object war gegruendet");
    }
    void hello(){
        System.out.println("Object Alphas Class");
    }
    void show(){
        hello();
        System.out.println("Names Feld: " + name);
    }
    Alpha3(String txt){
        objectCreated();
        name = txt;
    }
}
class Bravo3 extends Alpha3{
    void objectCreated(){
        System.out.println("Bravos Object war gegruendet");
    }
    void hello(){
        System.out.println("Object Bravos Class");
    }
    Bravo3(String txt){
        super(txt);
    }
}
public class VirtualMethodsApplication {
    public static void main(String[] args) {
        Alpha3 objA = new Alpha3("Alpha");
        objA.show();
        Bravo3 objB = new Bravo3("Bravo");
        objB.show();
    }
}
