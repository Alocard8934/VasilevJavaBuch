package VasilevJavaBuch.Glava_8_Klass_i_Object;

class Binomial{
    private int[] binoms;
    Binomial(int n){
        binoms = new int[n + 1];
        binoms[0] = 1;
        for(int i = 1; i <= n; i++){
            binoms[i] = binoms[i - 1] * (n - i + 1)/ i;
        }
    }
    public String toString(){
        String txt = "| ";
        for(int i = 0; i < binoms.length; i++){
            txt += binoms[i] + " | ";
        } 
        return txt;
    }
}
public class ArrayAsFieldApplication {
    public static void main(String[] args) {
        Binomial A = new Binomial(5);
        Binomial B = new Binomial(10);
        System.out.println(A);
        System.out.println(B);
    }
}
