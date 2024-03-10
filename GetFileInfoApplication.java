package VasilevJavaBuch.Glava_18_Argumenti;

import java.io.*;
public class GetFileInfoApplication {
    public static void main(String[] args) {
        String path = "d:\\documents\\MyData.pdf";
        System.out.println(path);
        File F = new File(path);
        System.out.println("Daten name: " + F.getName());
        System.out.println("Verzeichnis: " + F.getParent());
        File[] files = F.getParentFile().listFiles();
        System.out.println("Inhalt des Ordners:");
        for(int k = 0; k < files.length; k++){
            System.out.println("\t" + files[k].getName());
            if(files[k].isFile()){
                System.out.println(" - Datei");
            }else{
                System.out.println(" - Verzeichnis");
            }
        }
        System.out.println("Erstellen eines neuen Verzeichnisses und Verschieben einer Datei");
        File D = new File(F.getParentFile(), ".\\MyFiles");
        D.mkdir();
        try{
            System.out.println("Ein Verzeichnis ist erstellt worden " + D.getCanonicalPath());
        }catch(IOException e){
            System.out.println("Fehler: " + e);
        }
        F.renameTo(new File(D, "MyCV.pdf"));
        System.out.println("Datei " + F.getAbsolutePath());
        if(F.exists()){
            System.out.println(" existiert ");
        }else{
            System.out.println(" existiert nicht");
        }
        System.out.println("Im Verzeichnis " + D.getPath() + " es gibt Dateien:");
        files = D.listFiles();
        for(int k = 0; k < files.length; k++){
            System.out.println(files[k].getName());
        }
    }
}
