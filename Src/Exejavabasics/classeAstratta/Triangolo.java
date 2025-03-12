package Exejavabasics.classeAstratta;

public abstract class Triangolo extends Forma{
    public Triangolo(int base, int altezza) {
        super(TipoForma.TRIANGOLO, base, altezza);
    }
    @Override
    public void calcolaArea() {
        System.out.println("L'area del triangolo è: " + (getBase() * getAltezza()) / 2);
    }
}
