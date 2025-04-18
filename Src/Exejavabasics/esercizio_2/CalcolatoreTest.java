package Exejavabasics.esercizio_2;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalcolatoreTest {
    private Calcolatore calcolatore = new Calcolatore();

    //testare somma
    @Test
    public void somma() {
        int risultatoAtteso = 5;
        int risultatoSomma = calcolatore.somma(2, 3);
        assertEquals(risultatoAtteso,risultatoSomma);
    }

    @Test
    public void sottrazione() {
        int risultatoAtteso1 = 10;
        int risultatoSottrazione = calcolatore.sottrazione(20,10);
        assertEquals(risultatoAtteso1, risultatoSottrazione);
    }

    @Test
    public void divisione() {
        double risultatoAtteso2 = 5;
        double risultatoDivisione = calcolatore.divisione(25, 5);
        assertEquals(risultatoAtteso2, risultatoDivisione);
    }

    @Test
    public void moltiplicazione() {
        int risultatoAtteso3 = 25;
        int risultatoMoltiplicazione = calcolatore.moltiplicazione(5,5);
        assertEquals(risultatoAtteso3, risultatoMoltiplicazione);
    }
}