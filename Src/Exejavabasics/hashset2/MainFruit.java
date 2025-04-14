package Exejavabasics.hashset2;

public class MainFruit {
    public static void main(String[] args) {
        HashsetFruit hashsetFruit = new HashsetFruit();
        hashsetFruit.add("Mela");
        hashsetFruit.add("Banana");
        hashsetFruit.add("Pera");
        hashsetFruit.add("Arancia");
        String frutto = "Ananas";

        for (String fruit : hashsetFruit.getStringHashSet()){
            System.out.println(fruit);
        }
        if (hashsetFruit.getStringHashSet().contains(frutto)) {
            System.out.println("Trovato");
        } else {
            System.out.println("Non trovato");
        }
    }
}
