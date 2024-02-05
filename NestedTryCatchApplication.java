package VasilevJavaBuch.Glava_11_Iskluchitelniye_Situacii;

import java.util.*;
public class NestedTryCatchApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] symbs;
        int size, index;
        try{
            System.out.println("Größe des Arrays angeben");
            size = input.nextInt();
            symbs = new char[size];
            System.out.println("| ");
            for(int k = 0; k < size; k++){
                symbs[k] = (char)('A' + k);
                System.out.print(symbs[k] + " | ");
            }   
        try{
            System.out.println("\nIndex angeben;");
            index = input.nextInt();
            System.out.println("Symbol -" + symbs[index]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Es gibt kein solches Element");
        }finally{
            System.out.println("Das Array wurde erfolgreich erstellt");
        }
        System.out.println("Für den Index wird ein numerischer Wert angegeben");
        }catch(InputMismatchException e){
            System.out.println("Fehler: sie haben keine Zahl eingegeben");
        }catch(NegativeArraySizeException e){
            System.out.println("Falsche Array-Größe");
        }
        System.out.println("Die Programmausführung ist abgeschlossen");
    }
}
