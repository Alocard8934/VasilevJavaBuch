package VasilevJavaBuch.Glava_9_zusammengefasste_Datentypen;

public class UsingStaticGenMethodApplication {
    static <X> void show(X arg){
        System.out.println(arg);
    }
    static <X> void show(X[] array){
        System.out.print(" | ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " | ");
        }
        System.out.println("");
    }
    static <X> X getElement(X[] array, int index){
        return array[index];
    }
    public static void main(String[] args) {
        Integer[] nums = {1, 3, 7, 2};
        Character[] symbs = {'A', 'W', 'L', 'O', 'B'};
        System.out.println("Method show() aufrufen");
        System.out.print("Mit einem Textargument: ");
        show("Verallgemeinerte Methode");
        System.out.print("Mit einem Int-argument: ");
        show(123);
        System.out.print("Mit einem double-argument: ");
        show(123.45);
        System.out.print("Mit einem char-argument: ");
        show('A');
        System.out.print("Ganzzahlige array: ");
        show(nums);
        System.out.print("Symbol array: ");
        show(symbs);
        System.out.println("Method getElement() aufrufen");
        System.out.print("Ganzzahlige array: *");
        for(int i = 0; i < nums.length; i++){
            System.out.print(getElement(nums, i) + "*");
        }
        System.out.print("\nSymbole array: * ");
        for(int i = 0; i < symbs.length; i++){
            System.out.print(getElement(symbs, i) + "*");
        }
        System.out.println("");
    }
}
