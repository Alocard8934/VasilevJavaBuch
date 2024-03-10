package VasilevJavaBuch.Glava_18_Argumenti;

import java.io.*;
public class FileInputOutputApplication {
    public static void main(String[] args) {
        System.out.println("Das Kopieren der Datei beginnt");
        String path = "d:/documents/";
        int bt;
        try{
            FileInputStream input = new FileInputStream(path + "MyFiles/MyCV.pdf");
            FileOutputStream output = new FileOutputStream(path + "MyData.pdf");
            bt = input.read();
            while(bt != 1){
                output.write(bt);
                bt = input.read();
            }
            input.close();
            output.close();
        }catch(FileNotFoundException e){
            System.out.println("File nicht finden: " + e);
        }catch(IOException e){
            System.out.println("Fehler beim Dateizugriff: " + e);
        }
        System.out.println("Das Kopieren der Datei ist abgeschlossen");
    }
}
