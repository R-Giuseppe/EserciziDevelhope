package hashset3;

public class MainSport {
    public static void main(String[] args) {
        HashsetSport hashsetSport = new HashsetSport();
        hashsetSport.add("Calcio");
        hashsetSport.add("Basket");
        hashsetSport.add("Nuoto");
        hashsetSport.add("Scherma");
        hashsetSport.add("Pallavolo");

        String nuovoSport = "Tennis";
        hashsetSport.add("Tennis");

        System.out.println("Lista iniziale: ");
        for (String sport : hashsetSport.getStringHashSet()) {
            System.out.println(sport);
        }
        //verificare che il nuovo sport sia presente
        if (hashsetSport.getStringHashSet().contains(nuovoSport)) {

            //rimuovere se presente
            hashsetSport.remove(nuovoSport);
        }

        System.out.println("\n" + "Lista aggiornata: ");
        for (String sport : hashsetSport.getStringHashSet()) {
            System.out.println(sport);
        }
    hashsetSport.getStringHashSet().clear();
        System.out.println("\n" + "Lista svuotata: ");
        for (String sport : hashsetSport.getStringHashSet()) {
            System.out.println(sport);
        }

    }
}
