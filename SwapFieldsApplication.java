package VasilevJavaBuch.Glava_8_Klass_i_Object;

class MyClass{
    int number;
    MyClass(int n){
        number = n;
    }
}
public class SwapFieldsApplication {
    static void swap(MyClass A, MyClass B){
        System.out.println("The method \"swap\" is being executed");
        System.out.println("Object A: " + A.number);
        System.out.println("Object B: " + B.number);
        int number = B.number;
        B.number = A.number;
        A.number = number;
        System.out.println("The values of the fields have been changed");
        System.out.println("Object A: " + A.number);
        System.out.println("Object B: " + B.number);
        System.out.println("Method \"swap\" execution completed");
    }
    public static void main(String[] args) {
        MyClass A = new MyClass(100);
        MyClass B = new MyClass(200);
        System.out.println("Before calling the method \"swap\": A.number = " + A.number + " and B.number = " + B.number );
        swap(A, B);
        System.out.println("After calling the method \"swap\": A.number = " + A.number + " and B.number = " + B.number );
    }
}
