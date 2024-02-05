package VasilevJavaBuch.Glava_11_Iskluchitelniye_Situacii;


public class UsingExceptionObjectApplication {
    public static void main(String[] args) {
        try{
            System.out.println("Negative Größe");
            int[] a = new int[-1];
        }catch(NegativeArraySizeException e){
            System.out.println(e);
        }
        try{
            System.out.println("Ungültiger Index");
            int[] b = {1};
            b[-1] = 0;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        try{
            System.out.println("Division durch Null");
            int c = 10/0;
        }catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
