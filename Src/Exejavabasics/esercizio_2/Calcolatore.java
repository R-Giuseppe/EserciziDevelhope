package Exejavabasics.esercizio_2;

public class Calcolatore {

        public int somma (int a, int b){
            if (a == 0 && b == 0){
                throw new ArithmeticException("Zero più zero fa zero");
            }
            return a+b;
        }
        public int sottrazione (int a, int b){
            return a-b;
        }
        public double divisione (int numeratore, int denominatore){
            if (denominatore == 0){
                throw new ArithmeticException("Divisione per zero non permessa");
            }
            return (double) numeratore /denominatore;
        }
        public int moltiplicazione(int a, int b){
            return a*b;
        }
}
