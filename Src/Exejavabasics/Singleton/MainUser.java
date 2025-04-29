package Exejavabasics.Singleton;

public class MainUser {
        public static void main(String[] args) {
            // Primo utente con valori di default
            User user1 = new User();
            user1.stampaInformazioni();

            // Secondo utente con valori modificati
            User user2 = new User();
            user2.setNome("Giulia");
            user2.setEta(25);
            user2.stampaInformazioni();
        }
}
