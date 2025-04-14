package Exejavabasics.exceptions;

public class ExceptionInt {
    public boolean isInRange (int num, int min, int max) throws Exception {
        if (num > min && num < max ){
            return true;
        }
        throw new Exception("Il valore non è nel range");
    }
}
