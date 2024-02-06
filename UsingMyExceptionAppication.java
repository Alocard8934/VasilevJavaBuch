package VasilevJavaBuch.Glava_11_Iskluchitelniye_Situacii;

class MyException extends Exception{
    private int code;
    MyException(int n){
        super();
        code = n;
    }
    public String toString(){
        String txt = "Klassenausnahmen MyException()\n";
        txt += "Fehlercode: " + code + "\n";
        txt += "-------------------------------";
        return txt;
    }
}
class MyMistake extends RuntimeException{
    private int code;
    MyMistake(int n){
        super();
        code = n;
    }
    public String toString(){
        String txt = "Klassenausnahmen MyMistake()\n";
        txt += "Fehlercode: " + code + "\n";
        txt += "********************************";
        return txt;
    }
}
public class UsingMyExceptionAppication {
    static void alpha(int n) throws MyException{
        throw new MyException(n);
    }
    static void bravo(int n){
        throw new MyMistake(n);
    }
    public static void main(String[] args) {
        try{
            try{
                alpha(123);
            }catch(MyException e){
                System.out.println(e);
                bravo(321);
            }
        }catch(MyMistake e){
            System.out.println(e);
        }
    }
}
