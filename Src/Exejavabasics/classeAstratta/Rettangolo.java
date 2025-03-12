package Exejavabasics.classeAstratta;

public abstract class Rettangolo extends Forma{
    public Rettangolo(int base, int altezza) {
        super(TipoForma.RETTANGOLO, base, altezza);
    }
    @Override
    public void calcolaArea() {
        System.out.println("L'area del rettangolo è: " + getBase() * getAltezza());
    }
}
