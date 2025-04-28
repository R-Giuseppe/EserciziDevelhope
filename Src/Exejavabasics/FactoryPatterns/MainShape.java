package Exejavabasics.FactoryPatterns;

public class MainShape {
    //Stampa a video il risultato della funzione draw di ogni shape creata
    public static void main(String[] args) {
        for (ShapeType type : ShapeType.values()) {
            Shape shape = ShapeFactory.getShape(type);
            shape.draw();
        }
    }
}
