package VasilevJavaBuch.Glava_9_zusammengefasste_Datentypen;

class MyClass<X>{
    X data;
    MyClass(X data){
        this.data = data;
    }
    void show(){
        System.out.println("Feldwert: " + data);
    }
}
public class UsingGenClassApplication {
    public static void main(String[] args) {
        MyClass<Integer> A = new MyClass<Integer>(100);
        MyClass<Character> B = new MyClass<Character>('B');
        MyClass<String> C = new MyClass<String>("Gruen");
        A.show();
        B.show();
        C.show();
    }
}
