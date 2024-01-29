package VasilevJavaBuch.Glava_9_zusammengefasste_Datentypen;

interface MyMethods2<X>{
    X get();
    void set(X arg);
}
class Alphaa implements MyMethods2<Integer>{
    private Integer value;
    public Integer get(){
        return value;
    }
    public void set(Integer arg){
        value = arg;
    }
    void show(){
        System.out.println("Ganzzahlige Feld: " + get());
    }
    Alphaa(Integer arg){
        value = arg;
    }
}
class Bravoa implements MyMethods2<Character>{
    private Character value;
    public Character get(){
        return value;
    }
    public void set(Character arg){
        value = arg;
    }
    void show(){
        System.out.println("Symbols Feld: " + get());
    }
    Bravoa(Character arg){
        value = arg;
    }
}
public class MoreGenInterfaceApplication {
    public static void main(String[] args) {
        MyMethods2 ref;
        Alphaa A = new Alphaa(123);
        Bravoa B = new Bravoa('A');
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
