package VasilevJavaBuch.Glava_10_Lamda;

interface MyFunction{
    double f(double x);
}
public class DerivativeCalcApplication {
    static MyFunction Derivative(MyFunction ref){
        double dx = 1e-5;
        return (double x) -> {return(ref.f(x + dx) - ref.f(x)) / dx;};
    }
    public static void main(String[] args) {
        MyFunction A = Derivative((double x) -> {return x * (3 - x);});
        MyFunction B = Derivative((double x) -> {return x * Math.exp(-x);});
        System.out.println("Ableitung für die erste Funktion");
        System.out.println("Berechnet:\tGenau:");
        for(double t = 0; t <= 5;t++){
            System.out.printf("%8.5f\t%8.5f\n", A.f(t),(3 - 2 * t));
        }
        System.out.println("Ableitung für die zweite Funktion");
        System.out.println("Berechnet:\tGenau:");
        for(double t = 0; t <= 5; t++){
            System.out.printf("%8.5f\t%8.5f\n", B.f(t), Math.exp(-t)*(1-t));
        }
    }
}
