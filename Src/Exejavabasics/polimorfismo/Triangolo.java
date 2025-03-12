package Exejavabasics.polimorfismo;

public class Triangolo extends Forma{
    private int base;
    private int altezza;

    public Triangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public void calcolaArea() {
        int area = (base * altezza) / 2;
        System.out.println("L'area del triangolo è: " + area);
    }

}
