package VasilevJavaBuch;

class Alpha{
    String name;
    void show(){
        System.out.println("Object Alphas Class:");
        System.out.println("Field name - " + name);
    }
    
    Alpha(String name){
        this.name = name;
    }
}

class Bravo extends Alpha{
    int code;
    void show(){
        System.out.println("Object Bravos Class:");
        System.out.println("Field name - " + name);
        System.out.println("Field code - " + code);
    }
    Bravo(String name, int code){
        super(name);
        this.code = code;
    }
}

public class OverrideMethodApplication {
    public static void main(String[] args) {
        Alpha objA = new Alpha("objA");
        Bravo objB = new Bravo("objB", 123);
        objA.show();
        objB.show();
    }
}