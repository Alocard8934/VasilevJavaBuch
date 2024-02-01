package VasilevJavaBuch.Glava_10_Lamda;

class MyClassa{
    private int number;
    MyClassa(int n){
        number = n;
    }
    void set(int n){
        number = n;
    }
    int get(){
        return number;
    }
}
interface MyGettera{
    int myget(MyClassa obj);
}
interface MySettera{
    void myset(MyClassa obj, int n);
}
public class MethReferenceApplication {
    public static void main(String[] args) {
        MyClassa obj = new MyClassa(100);
        System.out.println("Objekt mit Feld 100 erstellt");
        MyGettera A = MyClassa::get;
        MySettera B = MyClassa::set;
        System.out.println("Variable A: " + A.myget(obj));
        System.out.println("Variable obj: " + obj.get());
        obj.set(200);
        System.out.println("Feld ist 200");
        System.out.println("Variable A: " + A.myget(obj) );
        B.myset(obj, 300);
        System.out.println("Command B.myset(obj, 300) ist running");
        System.out.println("Variable A: " + A.myget(obj));
        System.out.println("Variable obj: " + obj.get());
        obj = new MyClassa(400);
        System.out.println("Feld ist 400");
        System.out.println("Variable A: " + A.myget(obj));
        System.out.println("Variable obj: " + obj.get());
        B.myset(obj, 500);
        System.out.println("Command B.myset(obj, 500) ist running");
        System.out.println("Variable A: " + A.myget(obj));
        System.out.println("Variable obj: " + obj.get());
    }
}
