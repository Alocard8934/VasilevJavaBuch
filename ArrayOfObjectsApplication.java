package VasilevJavaBuch.Glava_8_Klass_i_Object;

class MyClass {
    private int number;

    MyClass(int n) {
        number = n;
    }

    int get() {
        return number;
    }
}

public class ArrayOfObjectsApplication {
    static MyClass[] createBinoms(int n) {
        MyClass[] bins = new MyClass[n + 1];
        bins[0] = new MyClass(1);
        for (int i = 1; i <= n; i++) {
            bins[i] = new MyClass(bins[i - 1].get() * (n - i + 1) / i);
        }
        return bins;
    }

    static void show(MyClass[] objs) {
        String txt = " | ";
        for (int i = 0; i < objs.length; i++) {
            txt += objs[i].get() + " | ";
        }
        System.out.println(txt);
    }

    public static void main(String[] args) {
        MyClass[] A = createBinoms(5);
        MyClass[] B = createBinoms(10);
        show(A);
        show(B);
    }
}