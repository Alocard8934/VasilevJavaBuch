package VasilevJavaBuch.Glava_9_zusammengefasste_Datentypen;

class Base1<X>{
    X data;
    Base1(X data){
        this.data = data;
    }
    void show(){
        System.out.println(data);
    }
}
class Alpha extends Base1<Integer>{
    Alpha(Integer n){
        super(n);
    }
    void show(){
        System.out.print("Ganzzahlende Feld: ");
        super.show();
    }
}
class Bravo extends Base1<String>{
    Bravo(String txt){
        super(txt);
    }
    void show(){
        System.out.print("Text Feld: ");
        super.show();
    }
}
class Charlie extends Base1<Character>{
    Charlie(Character s){
        super(s);
    }
    void show(){
        System.out.print("Symbols Feld: ");
        super.show();
    }
}
public class ExtendingGenClassApplication {
    public static void main(String[] args) {
        Alpha A = new Alpha(123);
        Bravo B = new Bravo("Object B");
        Charlie C = new Charlie('C');
        A.show();
        B.show();
        C.show();
    }
}
