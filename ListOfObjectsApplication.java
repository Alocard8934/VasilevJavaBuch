package VasilevJavaBuch.Glava_8_Klass_i_Object;

class MyClass3 {
    int number;
    MyClass3 next;

    // Default constructor
    public MyClass3() {
    }
}

public class ListOfObjectsApplication {
    static MyClass3 createList(int n) {
        MyClass3 obj = new MyClass3();
        obj.number = 1;
        MyClass3 t = obj;
        for (int i = 1; i <= n; i++) {
            t.next = new MyClass3();
            t.next.number = t.number * (n - i + 1) / i;
            t = t.next;
        }
        t.next = null;
        return obj;
    }

    static void showList(MyClass3 obj) {
        String txt = " | ";
        MyClass3 t = obj;
        do {
            txt += t.number + " | ";
            t = t.next;
        } while (t != null);
        System.out.println(txt);
    }

    public static void main(String[] args) {
        MyClass3 A = createList(5);
        MyClass3 B = createList(10);
        showList(A);
        showList(B);
    }
}
