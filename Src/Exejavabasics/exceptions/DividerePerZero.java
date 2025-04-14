package Exejavabasics.exceptions;

public class DividerePerZero {
    public void isDivisible(int numero){
        try{
            int divisione = numero / 0;
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
