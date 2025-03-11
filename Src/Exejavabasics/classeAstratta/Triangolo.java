package Exejavabasics.classeAstratta;

public abstract class Triangolo extends Forma{
    private int base;
    private int altezza;

    public Triangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public void calcolaArea(){
        System.out.println("Area del triangolo");
    }

}
