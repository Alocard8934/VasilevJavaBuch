package VasilevJavaBuch.Glava_10_Lamda;

class MyClassc{
    private int number;
    MyClassc(int n){
        number = n;
    }
    void show(){
        System.out.println("Wertfeld: " + number);
    }
    void set(int n){
        number = n;
    }
}
interface MyInterface{
    MyClassc create(int n);
}
public class ConstructorReferenceApplication {
    public static void main(String[] args) {
    MyInterface ref = MyClassc::new;
    MyClassc obj = ref.create(100);
    obj.show();
    obj.set(200);
    obj.show();
    }
    
}
