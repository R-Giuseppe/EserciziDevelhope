package Exejavabasics.classeAstratta;

public abstract class Forma {
    private int base;
    private int altezza;
    private TipoForma tipo;

    public int getBase() {
        return base;
    }

    public int getAltezza() {
        return altezza;
    }

    public TipoForma getTipo() {
        return tipo;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public void setTipo(TipoForma tipo) {
        this.tipo = tipo;
    }
    public Forma(TipoForma tipo, int base, int altezza) {
        this.tipo = tipo;
        this.base = base;
        this.altezza = altezza;
    }


    public abstract void calcolaArea();
}
