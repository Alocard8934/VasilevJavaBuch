package VasilevJavaBuch.Glava_10_Lamda;

interface MyInterface{
    int getNumber(int n);
}
class MyClassD{
    private MyInterface ref;
    MyClassD(MyInterface mi){
        set(mi);
    }
    void set(MyInterface mi){
        ref = mi;
    }
    int get(int n){
        return ref.getNumber(n);
    }
}
public class LambdaAsFieldApplication {
    public static void main(String[] args) {
        MyClassD obj = new MyClassD((int n) -> {return n*n;});
        System.out.println("Argument:");
        for(int k=0; k <= 5; k++){
            System.out.print(k + "\t");
        }
        System.out.println("\nDas Argument ist quadratisch:");
        for(int k = 0; k <= 5; k++){
            System.out.print(obj.get(k) + "\t");
        }
        obj.set((int n) -> {return n*n*n;});
        System.out.println("\nArgument im Würfel:");
        for(int k = 0; k <= 5; k++){
            System.out.print(obj.get(k) + "\t");
        }
        System.out.println("");
    }
}
