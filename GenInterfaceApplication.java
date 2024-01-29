package VasilevJavaBuch.Glava_9_zusammengefasste_Datentypen;

interface MyMethods<X>{
    X get();
    void set(X arg);
}
class MyClass3<X> implements MyMethods<X>{
    private X value;
    public X get(){
        return value;
    }
    public void set(X arg){
        value = arg;
    }
    void show(){
        System.out.println("Feldwert " + get());
    }
    MyClass3(X arg){
        value = arg;
    }
}   
public class GenInterfaceApplication {
    public static void main(String[] args) {
        MyMethods ref;
        MyClass3<Integer> A = new MyClass3<>(123);
        MyClass3<Character> B = new MyClass3<>('A');
        A.show();
        ref = A;
        ref.set(321);
        A.show();
        B.show();
        ref = B;
        ref.set('B');
        B.show();
    }
}
