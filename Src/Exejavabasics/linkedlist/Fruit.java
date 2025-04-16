package Exejavabasics.linkedlist;

public class Fruit {
    //Creare una classe Fruit che accenti nel costruttore il parametro name (String)
    private String name;

    public Fruit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Fruit name='" + name + '\'';
    }

    //In questa classe avere i metodi pubblici per ottenere le informazioni.

    public void ottieniInfo(){
        System.out.println("Name: " + this.name);
    }
}
