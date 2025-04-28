package Exejavabasics.FactoryPatterns;

public class ShapeFactory {
    //Crea una factory class che abbia un metodo che ritorni la forma corretta (shape) in base all'enum in input.
    public static Shape getShape(ShapeType type) {
        switch (type) {
            case CIRCLE:
                return new Circle();
            case TRIANGLE:
                return new Triangle();
            default:
                throw new IllegalArgumentException("Tipo di forma non supportato: " + type);
        }
    }
}
