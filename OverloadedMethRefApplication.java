package VasilevJavaBuch.Glava_10_Lamda;

class MyClassd{
    int number;
    void set(){
        number = 0;
    }
    void set(int n){
        number = n;
    }
}
interface AlphaB{
    void none();
}
interface BravoB{
    void one(int n);
}
public class OverloadedMethRefApplication {
    public static void main(String[] args) {
        MyClassd obj = new MyClassd();
        AlphaB A = obj::set;
        BravoB B = obj::set;
        B.one(100);
        System.out.println("Wertfeld: " + obj.number);
        A.none();   
        System.out.println("Wertfeld: " + obj.number);
    }
}
