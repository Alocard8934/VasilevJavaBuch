package VasilevJavaBuch.Glava_9_zusammengefasste_Datentypen;

class MyClassa<T>{
    T value;
    MyClassa(T val){
        value = val;
    }
}
public class UsingWildcardApplication {
    static<T> void show(MyClassa<T> obj){
        System.out.println("Method show erreichen: ");
        System.out.println(obj.value);
    }
    static void display(MyClassa<?> obj){
        System.out.println("Method Display erreichen: ");
        System.out.println(obj.value);
    }
    public static void main(String[] args) {
        MyClassa<Integer> A = new MyClassa<>(100);
        MyClassa B = new MyClassa<>('B');
        MyClassa<?> C = new MyClassa<>("Objekt C");
        show(A);
        display(A);
        show(B);
        display(B);
        show(C);
        display(C);
    }
}
