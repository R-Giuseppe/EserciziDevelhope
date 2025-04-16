package Exejavabasics.record;

public class MainPunto {
    public static void main(String[] args) {
        Punto p = new Punto(3, 5);

        System.out.println("Coordinata X: " + p.x());
        System.out.println("Coordinata Y: " + p.y());
        System.out.println("Punto: " + p);
    }
}
