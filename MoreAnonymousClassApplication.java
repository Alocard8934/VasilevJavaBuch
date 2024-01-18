package VasilevJavaBuch.Glava_8_Klass_i_Object;

interface Base9{
    default void show(){
        System.out.println("Base Interface");
    }
    void hello();
}

public class MoreAnonymousClassApplication {
    public static void main(String[] args) {
        Base9 obj = new Base9(){
            public void hello(){
                System.out.println("Object Anonim Classe");
            }
        };
            obj.show();
            obj.hello();
            new Base9(){
                public void hello(){
                    System.out.println("Anonim Object");
                }
                void showAll(){
                    hello();
                    show();
                }
            }.showAll();
        }
    
}
