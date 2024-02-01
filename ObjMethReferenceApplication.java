package VasilevJavaBuch.Glava_10_Lamda;

class MyClass{
    private int number;

    MyClass(int n) {
        number = n;
    }
    void set(int n){
        number = n;
    }
    int get(){
        return number;
    }    
}
interface MyGetter{
    int myget();
}
interface MySetter{
    void myset(int n);
}
public class ObjMethReferenceApplication {
    public static void main(String[] args) {
        MyClass obj = new MyClass(100);
        System.out.println("Objekt mit 100 Feld erstellen");
        MyGetter A = obj::get;
        MySetter B = obj::set;
        System.out.println("Variable A: " + A.myget());
        System.out.println("Variable obj: " + obj.get());
        obj.set(200);
        System.out.println("Feld ist 200");
        System.out.println("Variable A: " + A.myget());
        B.myset(300);
        System.out.println("Command B.myset(300) ist running");
        System.out.println("Variable A: " + A.myget());
        System.out.println("Variable obj: " + obj.get());
        obj = new MyClass(400);
        System.out.println("Object mit Feld 400 hat gegruenden");
        System.out.println("Variable A: " + A.myget() );
        System.out.println("Variable obj: " + obj.get());
        B.myset(500);
        System.out.println("Command B.myset(500) ist running");
        System.out.println("Variable A: " + A.myget());
        System.out.println("Variable obj: " + obj.get());
    }
}
