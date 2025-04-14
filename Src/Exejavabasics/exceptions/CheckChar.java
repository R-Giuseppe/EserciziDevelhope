package Exejavabasics.exceptions;

public class CheckChar {
    public boolean isAInt(char carattere) throws Exception {
        Character.isDigit(carattere);
        if (Character.isDigit(carattere)){
            return true;
        }
        throw new Exception("Il carattere non è un numero");
    }
}
