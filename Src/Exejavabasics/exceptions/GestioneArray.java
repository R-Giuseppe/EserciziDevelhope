package Exejavabasics.exceptions;

import java.lang.reflect.Array;

public class GestioneArray {
    public void arrayCheck (int[] array, int index){
       try {
           int numero = array[index];
           int divisione = numero / 0;
       }catch(ArithmeticException | IndexOutOfBoundsException e){
           System.out.println(e.getMessage());
       }
    }
}
