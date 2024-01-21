package VasilevJavaBuch.Glava_9_zusammengefasste_Datentypen;


class MyClass1{
    String name;
    <X> void show(X arg){
        System.out.println(name + ": " + arg);
    }
    MyClass1(String txt){
        name = txt;
    }
}

public class UsingGenMethodsApplication {
    public static void main(String[] args) {
        MyClass1 A = new MyClass1("Object A");
        MyClass1 B = new MyClass1("Object B");
        A.show(123);
        A.show("Alpha");
        A.show('A');
        B.show(123);
        B.show("Bravo");
        B.show('B');
                
    }
}
