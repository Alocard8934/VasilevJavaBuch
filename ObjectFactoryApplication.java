package VasilevJavaBuch.Glava_8_Klass_i_Object;

abstract class Base{
    abstract void show();
}
class Alpha extends Base{
    void show(){
        System.out.println("Object Alphas Classe");
    }
}
class Bravo extends Base{
    void show(){
        System.out.println("Object Bravos Classe");
    }
}
class Charlie extends Base{
    void show(){
        System.out.println("Object Charlie Classe");
    }
}
public class ObjectFactoryApplication {
    static Base createObject(int n){
        if(n == 1) return new Alpha();
        if(n == 2) return new Bravo();
        return new Charlie();
    }
    public static void main(String[] args) {
        Base obj;
        for(int i = 1; i <= 3; i++){
            obj = createObject(i);
            obj.show();
        }
    }
}
