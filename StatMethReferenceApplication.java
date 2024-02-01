package VasilevJavaBuch.Glava_10_Lamda;

class MyClassb{
    static void show(){
        System.out.println("Method von MyClass klasse");
    }
    static int sum(int n){
        int k, s = 0;
        for(k = 1; k <= n; k++){
            s += k;
        }
        return s;
    }
}
interface MyShow{
    void myshow();
}
interface MySum{
    int mysum(int n);
}
interface MyPrinter{
    void myprint(Object t);
}
public class StatMethReferenceApplication {
    public static void main(String[] args) {
        MyShow A = MyClassb::show;
        MySum B = MyClassb::sum;
        MyPrinter P = System.out::println;
        A.myshow();
        P.myprint("Zahlsumme: " + B.mysum(10));
    }
}
