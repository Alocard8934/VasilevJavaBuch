package VasilevJavaBuch.Glava_8_Klass_i_Object;

abstract class Base8{
    private String name;
    Base8(String txt){
        name = txt;
    }
    void show(){
        System.out.println("Objeckten Name: " + name);
    }
    abstract void hello();
}
public class AnonymousClassApplication {
    public static void main(String[] args) {
        Base8 obj = new Base8("Rot"){
        void hello(){
            System.out.println("Objekt einer anonymen Klasse");
        }
        };
        obj.show();
        obj.hello();
        new Base8("Gruen"){
            void hello(){
                System.out.println("Anonymen Object");
            }
            void showAll(){
                hello();
                show();
            }
        }.showAll();
    }
}
