package VasilevJavaBuch.Glava_10_Lamda;

interface MyNums{
    default void show(int n){
        System.out.println("Argument: " + n);
        System.out.println("Result: " + get(n));
    }
    int get(int n);
}
public class UsingAnonymoisClassApplication {
    public static void main(String[] args) {
        MyNums A = new MyNums(){
            public int get(int n){
                int k, s = 0;
                for(k = 1; k <= n; k++){
                    s += k;
                }
                return s;
            }
        };
        System.out.println("Man verwendet anonymous Classe:");
        A.show(10);
        System.out.println("Pruefung: " +  A.get(10));
        MyNums B = A;
        System.out.println("Neu anonymous Classe:");
        A = new MyNums(){
            public int get(int n){
                return n * n;
            }
        };
        System.out.println("Method show erreichen aus A:");
        A.show(10);
        System.out.println("Method show erreichen aus B:");
        B.show(10);
    }
}
