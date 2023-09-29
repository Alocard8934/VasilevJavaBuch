package VasilevJavaBuch;

import java.util.Scanner;
public class ConsoleInputApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String day, month;
        System.out.println("What day is today?");
        day = input.nextLine();
        System.out.println("What month is it today?");
        month = input.nextLine();
        String text;
        text = "Today is " + day + " Today is " + month;
        System.out.println(text);
    }
}
