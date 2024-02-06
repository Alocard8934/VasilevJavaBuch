package VasilevJavaBuch.Glava_11_Iskluchitelniye_Situacii;


public class UsingThrowApplication {
    public static void main(String[] args) {
        Exception me = new Exception("Künstlicher Fehler");
        try{
            System.out.println("Es wird ein Fehler generiert");
            try{
                throw me;
            }catch(Exception one){
            System.out.println(one);
            System.out.println("Und jetzt noch ein Fehler");
            throw one;
            }
        }catch(Exception two){
            System.out.println(two);
        }
        System.out.println("Die Programmausführung ist abgeschlossen");
    }
}
