package Exejavabasics.ereditarieta2;

public class Forma {

    public static void main(String[] args) {
        Forma forma = new Forma();
        forma.calcolaArea();
        Rettangolo rettangolo = new Rettangolo(5, 10);
        rettangolo.calcolaArea();
    }
    public void calcolaArea() {
        System.out.println("L'area della forma è: ");
    }


}
