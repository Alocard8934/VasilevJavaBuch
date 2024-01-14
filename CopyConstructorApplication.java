package VasilevJavaBuch.Glava_8_Klass_i_Object;

class Base1{
    String name;
    Base1(String txt){
        name = txt;
    }
    Base1(Base1 obj){
        name = obj.name;
    }
}
class MyClass extends Base1{
    int code;
    MyClass(String txt, int n){
        super(txt);
        code = n;
    }
    MyClass(MyClass obj){
        super(obj);
        code = obj.code;
    }
    void show(){
        System.out.println("Text Feld: " + name);
        System.out.println("Ganzzahliges Feld: " + code);
    }
}
public class CopyConstructorApplication {
    public static void main(String[] args) {
         MyClass A = new MyClass("Gelb", 200);
        MyClass B = new MyClass(A);
        A.name = "Rot";
        A.code = 100;
       MyClass C = new MyClass("Gruen", 300);
        System.out.println("Object A");
        A.show();
        System.out.println("Object B");
        B.show();
        System.out.println("Object C");
        C.show();
    }
}
