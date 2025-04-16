package Exejavabasics.linkedlist;

import java.util.LinkedList;

public class MainLinkedList {
    public static void main(String[] args) {
        //Creare un LinkedList con elementi e stamparlo in console.
        LinkedList<Fruit> fruits = new LinkedList<>();

        Fruit mela = new Fruit("mela");
        Fruit banana = new Fruit("banana");
        Fruit pera = new Fruit("pera");
        Fruit ananas = new Fruit("ananas");
        Fruit mango = new Fruit("mango");

        fruits.add(mela);
        fruits.add(banana);
        fruits.add(pera);
        fruits.add(ananas);
        fruits.add(mango);

        System.out.println(fruits);
        //Aggiungere un elemento al primo posto della lista e uno all'ultimo
        Fruit melone = new Fruit("melone");
        Fruit fragola = new Fruit("fragola");

        fruits.addFirst(melone);
        fruits.addLast(fragola);

        //Stampare la collezione aggiornata
        System.out.println(fruits);
    }
}
