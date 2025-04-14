package Exejavabasics.exceptions;

public class Main_exceptions {
    public static void main(String[] args) {
        int num = 11;
        int min = 1;
        int max = 10;
        ExceptionInt exceptions = new ExceptionInt();
        DividerePerZero dividerePerZero = new DividerePerZero();
        dividerePerZero.isDivisible(5);
    }
}
