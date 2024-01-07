package VasilevJavaBuch;

class MyClass{
    String name;
    int code;
    MyClass(String txt, int num){
        name = txt;
        code = num;
    }
    public String toString(){
        String txt = "Object MyClass \n";
        txt += "Names Feld: " + name + "\n";
        txt += "Codes Feld: " + code + "\n";
        for(int i = 0; i <= 21; i++){
            txt += "-";
        }
        return txt;
    }
}
    
public class UsingToStringApplication {
    public static void main(String[] args) {
        MyClass obj = new MyClass("Object obj", 123);
        System.out.println(obj);
    }
}
