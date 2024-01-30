package VasilevJavaBuch.Glava_9_zusammengefasste_Datentypen;

class Alphab{
    private String name;
    Alphab(String txt){
        name = txt;
    }
    public String toString(){
        return name;
    }
}
class Bravob extends Alphab{
    Bravob(String txt){
        super(txt);
    }
}

class Charlieb extends Bravob{
    Charlieb(String txt){
        super(txt);
    }
}
class Deltab extends Charlieb{
    Deltab(String txt){
        super(txt);
    }
}
class Echob extends Deltab{
    Echob(String txt){
        super(txt);
    }
}
class MyClassc<T>{
    private T obj;
    public String toString(){
        return obj.toString();
    }
    MyClassc(T arg){
        obj = arg;
    }
}
        
        
public class BoundedWildcardsApplication {
    static void show(MyClassc<? extends Charlieb> obj){
        System.out.println(obj);
    }
    static void display(MyClassc<? super Charlieb> obj){
        System.out.println(obj);
    }
    public static void main(String[] args) {
        MyClassc<Alphab> A = new MyClassc<>(new Alphab("Objekt A"));    
        MyClassc<Bravob> B = new MyClassc<>(new Bravob("Objekt B")); 
        MyClassc<Charlieb> C = new MyClassc<>(new Charlieb("Objekt C")); 
        MyClassc<Deltab> D = new MyClassc<>(new Deltab("Objekt D")); 
        MyClassc<Echob> E = new MyClassc<>(new Echob("Objekt E")); 
        display(A);
        display(B);
        display(C);
        show(C);
        show(D);
        show(E);
    }
}
