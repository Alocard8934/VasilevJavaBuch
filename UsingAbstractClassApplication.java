package VasilevJavaBuch;

abstract class ColoredFigure{
    String color;
    int size;
    ColoredFigure(String clr, int s){
        color = clr;
        size = s;
    }
    void show(){
        System.out.println("Figure " + color + " " + getName());
        System.out.println("Grosse (" + getSizeName() + "):" + size);
        System.out.printf("Flache: %.3f\n", getArea());
        String line = " ";
        for(int i = 0; i <= 30; i++){
            line += "*";
        }
        System.out.println(line);
    }
    String getSizeName(){
        return "Seite";
    }
    abstract String getName();
    abstract double getArea();
}
class Triangle extends ColoredFigure{
    Triangle(String clr, int s){
        super(clr, s);
    }
    String getName(){
        return "Dreieck";
    }
    double getArea(){
        double k = Math.sqrt(3)/4;
        return size * size * k;
    }
}
class Square extends ColoredFigure{
    Square(String clr, int s){
        super(clr, s);
    }
    String getName(){
        return "Quadrat";
    }
    double getArea(){
        double k = 1;
        return size * size * k;
    }    
}
class Circle extends ColoredFigure{
    Circle(String clr, int s){
        super(clr, s);
    }
    String getName(){
        return "Kreis";
    }
    double getArea(){
        double k = Math.PI;
        return size * size * k;
    }
    String getSizeName(){
        return "Radius";
    }
}
public class UsingAbstractClassApplication {
    public static void main(String[] args) {
        Triangle T = new Triangle("rot", 2);
        Square S = new Square("schwarz", 3);
        Circle C = new Circle("gelb", 1);
        
        System.out.println("Verwendung von Objektvariablen der Unterklasse");
        T.show();
        S.show();
        C.show();
        ColoredFigure F;
        System.out.println("Verwendung einer abstrakten Oberklassenobjektvariablen");
        F = T;
        F.show();
        F = S;
        F.show();
        F = C;
        F.show();
    }
}
