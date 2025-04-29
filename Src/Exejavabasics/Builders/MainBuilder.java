package Exejavabasics.Builders;

public class MainBuilder {
    public static void main(String[] args) {
        Person person1 = new Person.Builder("Mario", "Rossi")
                .age(30)
                .address("Via Roma 10")
                .build();

        Person person2 = new Person.Builder("Luca", "Bianchi")
                .build(); // solo nome e cognome

        System.out.println(person1);
        System.out.println(person2);
    }
}
