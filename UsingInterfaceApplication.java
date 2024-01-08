package VasilevJavaBuch;

interface MyInterface{
    int NUMBER = 100;
    int getNumber(double x);
    char getSymbol(int n);
}

class MyClass implements MyInterface{
    public int getNumber(double x){
        return (int)x;
    }
    public char getSymbol(int n){
        return (char)('A' + n);
    }
}

public class UsingInterfaceApplication {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        System.out.println("Statische Konstante: " + MyClass.NUMBER);
        System.out.println("Ganze Zahl: " + obj.getNumber(12.5));
        System.out.println("Symbol: " + obj.getSymbol(3));
    }
}
