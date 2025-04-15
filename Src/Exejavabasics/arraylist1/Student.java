package Exejavabasics.arraylist1;

public class Student {
    //Creare una classe Student che accenti nel costruttore il parametro name (String) e age (Int)
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //In questa classe avere i metodi pubblici per ottenere le informazioni.
    public void ottieniInfo(){
        System.out.println("Name: " + this.name + "Age: " + this.age);
    }
}
