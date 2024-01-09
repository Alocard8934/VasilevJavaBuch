package VasilevJavaBuch;

interface Base{
    void show();
}
class Alpha6 implements Base{
    String word;
    Alpha6(String txt){
        word = txt;
    }
    public void show(){
        System.out.println("Object Alphas Class");
        System.out.println("Text Feld: " + word);
    }
}
class Bravo6 implements Base{
    int number;
    Bravo6(int n){
        number = n;
    }
    public void show(){
        System.out.println("Object Bravos Class");
        System.out.println("Intaktes Feld: " + number);
    }
}
public class UsingInterfaceVarsApplication {
    public static void main(String[] args) {
        Base ref;
        ref = new Alpha6("Text");
        ref.show();
        ref = new Bravo6(123);
        ref.show();
    }
}
