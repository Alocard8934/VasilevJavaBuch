package VasilevJavaBuch.Glava_10_Lamda;

interface Alpha{
    void showA();
}
interface Bravo{
    void showB();
}
interface Charlie{
    void showC();
}
public class LambdaAndInterfacesApplication {
    public static void main(String[] args) {
        Alpha A =()->System.out.println("Man verwendet Lambda");
        A.showA();
        Bravo B =()->System.out.println("Man verwendet Lambda");
        B.showB();
        Charlie C = A::showA;
        C.showC();
    }
}
