package Exejavabasics.polimorfismo;

public class Rettangolo extends Forma {
    private int base;
    private int altezza;

    public Rettangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public void calcolaArea() {
        int area = base * altezza;
        System.out.println("L'area del rettangolo è: " + area);
    }
}
