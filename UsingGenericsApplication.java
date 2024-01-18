package VasilevJavaBuch.Glava_9_zusammengefasste_Datentypen;

class Alpha<X>{
    private X first;
    Alpha(X first){
        set(first);
    }
    void set(X first){
        this.first= first;
    }
    X get(){
        return first;
    }
}
class Bravo<X, Y>{
    Alpha<X> obj;
    Y second;
    Bravo(X first, Y second){
        obj = new Alpha<X>(first);
        this.second = second;
    }
    void show(){
        System.out.println("Werte " + obj.get() + " und " + second);
    }
}
public class UsingGenericsApplication {
    public static void main(String[] args) {
        Bravo<Integer, Character> A = new Bravo<Integer, Character>(100, 'A');
        A.show();
        Bravo<String, Double> B = new Bravo<String, Double>("BRAVO", 12.345);
        B.show();
    }
}
