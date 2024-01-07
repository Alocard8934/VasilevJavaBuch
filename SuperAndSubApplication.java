package VasilevJavaBuch;

class Alpha5{
    String name;
    void show(){
        String txt = "Object Alphas Classe\n";
        txt += "Names Fels: " + name + "\n";
        for(int i = 1; i <= 20; i++){
            txt += "-";
        }
        System.out.println(txt);
    }
}

class Bravo5 extends Alpha5{
    int code;
    void show(){
        String txt = "Object Bravos Classe\n";
        txt += "Names Feld: " + name + "\n";
        txt += "Codes Feld: " + code + "\n";
        for(int i = 1; i <= 20; i++){
            txt += "-";
        }
        System.out.println(txt);
    }
}
public class SuperAndSubApplication {
    public static void main(String[] args) {
        Alpha5 objA = new Alpha5();
        objA.name = "Alpha";
        objA.show();
        Bravo5 objB = new Bravo5();
        objB.name = "Bravo";
        objB.code = 123;
        objB.show();
        objA = objB;
        objA.name = "Charlie";
        objA.show();
        objB.show();
    }
}
