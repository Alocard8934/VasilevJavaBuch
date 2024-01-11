package VasilevJavaBuch.Glava_8_Klass_i_Object;

public class MethodArgumentsDemo {
    static void swap(int a, int b){
        System.out.println("The method \"swap\" is being executed");
        System.out.println("Arguments before changing values: " + a + " and " + b);
        int x = b;
        b = a;
        a = x;
        System.out.println("Arguments after changing values: " + a + " and " + b);
        System.out.println("Completion of the method \"swap\" execution");
    }
    public static void main(String[] args) {
        int m = 100, n = 200;
        System.out.println("Variables before calling the method \"swap\"" + m + " and " + n);
        swap(m, n);
        System.out.println("Variables after calling the method \"swap\"" + m + " and " + n);
    }
}
