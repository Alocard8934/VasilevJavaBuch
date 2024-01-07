package VasilevJavaBuch;

class Alpha2{
    String name;
}
class Bravo2 extends Alpha2{
    String name;
    void show(){
        System.out.println("Aus Alpha Class: " + super.name);
        System.out.println("Aus Bravo Class: " + name);
    }
    Bravo2(String a, String b){
        super();
        super.name = a;
        name = b;
    }
}
public class HidingFieldApplication {
    public static void main(String[] args) {
        Bravo2 obj = new Bravo2("Alpha", "Bravo");
        obj.show();
    }
}
