package VasilevJavaBuch;

class Alpha4{
    void show(){
        System.out.println("Alphas Class");
    }
    void show(String txt){
        System.out.println(txt);
    }
}

class Bravo4 extends Alpha4{
    void show(){
        System.out.println("Bravos Class");
    }
    void show(int num){
        System.out.println("Zahl " + num);
    }
}
public class OverloadingAndOverridingApplication {
    public static void main(String[] args) {
        Alpha4 objA = new Alpha4();
        objA.show();
        objA.show("Object objA");
        Bravo4 objB = new Bravo4();
        objB.show();
        objB.show("Object objB");
        objB.show(123);
    }
}
