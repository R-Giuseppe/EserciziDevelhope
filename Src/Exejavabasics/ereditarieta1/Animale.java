package Exejavabasics.ereditarieta1;

public class Animale {
    //Scrivere un programma che contenga una classe chiamata Animale ed un metodo chiamato faiIlVerso() che stampi il verso dell'animale.
    //Crea poi una sottoclasse chiamata Gatto che fa override del metodo faiIlVerso() per miagolare. Prova quindi a far stampare il verso di Animale e di Gatto

    public static void main(String[] args) {
        Animale animale = new Animale();
        animale.faiIlVerso();
        Gatto gatto = new Gatto();
        gatto.faiIlVerso();
    }
    public void faiIlVerso() {
        System.out.println("Il verso dell'animale è: ");
    }
}
