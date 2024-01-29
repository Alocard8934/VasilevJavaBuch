package VasilevJavaBuch.Glava_9_zusammengefasste_Datentypen;

class Base2{
    String name;
    Base2(String txt){
        name = txt;
    }
    void show(){
        System.out.println("Text Feld: " + name);
    }
}
class Alpha1 extends Base2{
    int number;
    Alpha1(String txt, int n){
        super(txt);
        number = n;
    }
    void show(){
        super.show();
        System.out.println("Ganzzahlige Feld: " + number);
    }
}
class Bravo1 extends Alpha1{
    char symbol;
    Bravo1(String txt, int n, char s){
        super(txt, n);
        symbol = s;
    }
    void show(){
        super.show();
        System.out.println("Symbols Feld: " + symbol);
    }
}
class MyClass<X extends Base2>{
    X obj;
    MyClass(X obj){
        this.obj = obj;
    }
    void show(){
        System.out.println("Object MyClass");
        obj.show();
    }
}
public class GenTypeExtendingApplication {
    public static void main(String[] args) {
        MyClass<Alpha1> A = new MyClass<>(new Alpha1("Alpha", 123));
        MyClass<Bravo1> B = new MyClass<>(new Bravo1("Bravo", 321, 'B'));
        A.show();
        B.show();
    }
}
