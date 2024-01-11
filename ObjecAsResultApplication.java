package VasilevJavaBuch.Glava_8_Klass_i_Object;

class MyClass{
    private int code;
    private String name;
    MyClass(int n, String s){
        System.out.println("Creating an object");
        set(n, s).show();
    }
    MyClass set(int n){
        code = n;
        return this;
    }
    MyClass set(String s){
        name = s;
        return this;
    }
    MyClass set(int n, String s){
        return set(n).set(s);
    }
    void show(){
        System.out.println("Code Field = " + code);
        System.out.println("Name Field = " + name);
        System.out.println("-------------");
    }
}
public class ObjecAsResultApplication {
    static MyClass createObject(int n, String s){
        return new MyClass(n, s);
    }
    public static void main(String[] args) {
        MyClass obj = createObject(100, "alpha");
        obj.set(200).show();
        obj.set("bravo").show();
        obj.show();
        createObject(300, "charlie").set(400, "delta").show();
    }
}
