package VasilevJavaBuch.Glava_11_Iskluchitelniye_Situacii;


public class UsingCheckedExceptionApplication {
    static void alpha(int n) throws Exception{
        String txt = "Methode alpha() mit Argument " + n;
        throw new Exception(txt);
    }
    static void bravo(int n){
        String txt = "Methode bravo() mit Argument " + n;
        try{
            if(n > 0){
                throw new Exception(txt);
            }else{
                throw new RuntimeException(txt);
            }
        }catch(RuntimeException e){
            throw e;
        }catch(Exception e){
            System.out.println("Fehlerbehandlung in bravo():");
            System.out.println(e.getMessage());
            System.out.println("********************************");
        }
    }
    static void catchMe(Exception e){
        System.out.println("Fehlerbehandlung in main():");
        System.out.println(e.getMessage());
        System.out.println("-----------------------------");
    }
    public static void main(String[] args) {
        try{
            alpha(123);
        }catch(Exception e){
            catchMe(e);
        }
        try{
            bravo(123);
        }catch(Exception e){
            catchMe(e);
        }
        try{
            bravo(-1);
        }catch(Exception e){
            catchMe(e);
        }
    }
}
